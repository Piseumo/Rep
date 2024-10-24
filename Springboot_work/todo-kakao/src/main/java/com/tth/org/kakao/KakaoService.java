package com.tth.org.kakao;

import com.tth.org.error.UserException;
import com.tth.org.filter.JWTUtils;
import com.tth.org.kakao.dto.KakaoTokenDto;
import com.tth.org.kakao.dto.KakaoUserInfoDto;
import com.tth.org.kakao.jpa.KakaoEntity;
import com.tth.org.kakao.jpa.KakaoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class KakaoService {

    private final KakaoRepository kakaoRepository;
    private final Environment environment;
    private final JWTUtils jwtUtils;

    @Transactional
    public String getToken(String code) {
        try {
            String url = "https://kauth.kakao.com/oauth/token";
            RestTemplate restTemplate = new RestTemplate();

            MultiValueMap headers = new LinkedMultiValueMap();
            headers.add("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");

            MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
            body.add("grant_type", "authorization_code");
            body.add("client_id", environment.getProperty("oauth.kakao.client_id"));
            body.add("redirect_uri", "http://localhost:5173/oauth");
            body.add("code", code);
            body.add("client_secret", environment.getProperty("oauth.kakao.client_secret"));

            HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(body, headers);

            ResponseEntity<KakaoTokenDto> result = restTemplate.exchange(url, HttpMethod.POST, requestEntity, KakaoTokenDto.class);
            log.info("result: {}", result);
            KakaoTokenDto kakaoTokenDto = result.getBody();

            //유저 정보 가져오기
            HttpHeaders headers2 = new HttpHeaders();

            headers2.add("Authorization", "Bearer " + kakaoTokenDto.getAccess_token());
            ResponseEntity<KakaoUserInfoDto> res = restTemplate.exchange("https://kapi.kakao.com/v2/user/me"
                    ,HttpMethod.GET
                    ,new HttpEntity<>(null,headers2)
                    , KakaoUserInfoDto.class
            );
            KakaoUserInfoDto kakaoUserInfoDto = res.getBody();

            KakaoEntity dbkakaoEntity = kakaoRepository.findByEmail(kakaoUserInfoDto.getKakaoAccount().getEmail());

            if (dbkakaoEntity == null){
            KakaoEntity kakaoEntity = new ModelMapper().map(kakaoTokenDto, KakaoEntity.class);
            kakaoEntity.setEmail(kakaoUserInfoDto.getKakaoAccount().getEmail());
            kakaoEntity.setNickname(kakaoUserInfoDto.getKakaoAccount().getProfile().getNickname());
            kakaoEntity.setProfile_image(kakaoUserInfoDto.getKakaoAccount().getProfile().getProfileImageUrl());
            kakaoEntity.setThumbnail_image(kakaoUserInfoDto.getKakaoAccount().getProfile().getThumbnailImageUrl());
            kakaoRepository.save(kakaoEntity);
            }
            else {
            dbkakaoEntity.setNickname(kakaoUserInfoDto.getKakaoAccount().getProfile().getNickname());
            dbkakaoEntity.setProfile_image(kakaoUserInfoDto.getKakaoAccount().getProfile().getProfileImageUrl());
            dbkakaoEntity.setThumbnail_image(kakaoUserInfoDto.getKakaoAccount().getProfile().getThumbnailImageUrl());
            dbkakaoEntity.setUserId(UUID.randomUUID().toString());

            dbkakaoEntity.setAccess_token(kakaoTokenDto.getAccess_token());
            dbkakaoEntity.setRefresh_token(kakaoTokenDto.getRefresh_token());
            dbkakaoEntity.setExpires_in(kakaoTokenDto.getExpires_in());
            dbkakaoEntity.setRefresh_token_expires_in(kakaoTokenDto.getRefresh_token_expires_in());
            kakaoRepository.save(dbkakaoEntity);

            }

            String jwt = jwtUtils.createJwt(kakaoUserInfoDto.getKakaoAccount().getEmail());
            return jwt;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "fail";
    }
    @Transactional
    public void messageSend(String jwt ,String message) {
            String email = jwtUtils.getEmailFromJwt(jwt);

            RestTemplate  restTemplate = new RestTemplate();

            String url = "https://kapi.kakao.com/v2/api/talk/memo/default/send";

            MultiValueMap headers2 = new LinkedMultiValueMap();
            headers2.add("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");

            //-------------//
            KakaoEntity kakaoEntity = kakaoRepository.findByEmail(email);
            if (kakaoEntity == null){
                throw new UserException("Could not find user by email");
            }

            headers2.add("Authorization", "Bearer " + kakaoEntity.getAccess_token());

            MultiValueMap<String, String> body2 = new LinkedMultiValueMap<>();
            body2.add("template_object", String.format(messageString(),email,message));

            HttpEntity<MultiValueMap<String, String>> requestEntity2 = new HttpEntity<>(body2, headers2);

            ResponseEntity<String> result2 =
                    restTemplate.exchange(url, HttpMethod.POST, requestEntity2, String.class);

            log.info("msg 카카오 메세지 전송 성공...." + result2.toString());

    }

        public String messageString(){
            return "{\n" +
                    "        \"object_type\": \"feed\",\n" +
                    "        \"content\": {\n" +
                    "            \"title\": \"%s님의 %s\",\n" +
                    "            \"description\": \"아메리카노, 빵, 케익\",\n" +
                    "            \"image_url\": \"https://mud-kage.kakao.com/dn/NTmhS/btqfEUdFAUf/FjKzkZsnoeE4o19klTOVI1/openlink_640x640s.jpg\",\n" +
                    "            \"image_width\": 640,\n" +
                    "            \"image_height\": 640,\n" +
                    "            \"link\": {\n" +
                    "                \"web_url\": \"http://www.daum.net\",\n" +
                    "                \"mobile_web_url\": \"http://m.daum.net\",\n" +
                    "                \"android_execution_params\": \"contentId=100\",\n" +
                    "                \"ios_execution_params\": \"contentId=100\"\n" +
                    "            }\n" +
                    "        },\n" +
                    "        \"item_content\" : {\n" +
                    "            \"profile_text\" :\"Kakao\",\n" +
                    "            \"profile_image_url\" :\"https://mud-kage.kakao.com/dn/Q2iNx/btqgeRgV54P/VLdBs9cvyn8BJXB3o7N8UK/kakaolink40_original.png\",\n" +
                    "            \"title_image_url\" : \"https://mud-kage.kakao.com/dn/Q2iNx/btqgeRgV54P/VLdBs9cvyn8BJXB3o7N8UK/kakaolink40_original.png\",\n" +
                    "            \"title_image_text\" :\"Cheese cake\",\n" +
                    "            \"title_image_category\" : \"Cake\",\n" +
                    "            \"items\" : [\n" +
                    "                {\n" +
                    "                    \"item\" :\"Cake1\",\n" +
                    "                    \"item_op\" : \"1000원\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"item\" :\"Cake2\",\n" +
                    "                    \"item_op\" : \"2000원\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"item\" :\"Cake3\",\n" +
                    "                    \"item_op\" : \"3000원\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"item\" :\"Cake4\",\n" +
                    "                    \"item_op\" : \"4000원\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"item\" :\"Cake5\",\n" +
                    "                    \"item_op\" : \"5000원\"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"sum\" :\"Total\",\n" +
                    "            \"sum_op\" : \"15000원\"\n" +
                    "        },\n" +
                    "        \"social\": {\n" +
                    "            \"like_count\": 100,\n" +
                    "            \"comment_count\": 200,\n" +
                    "            \"shared_count\": 300,\n" +
                    "            \"view_count\": 400,\n" +
                    "            \"subscriber_count\": 500\n" +
                    "        },\n" +
                    "        \"buttons\": [\n" +
                    "            {\n" +
                    "                \"title\": \"웹으로 이동\",\n" +
                    "                \"link\": {\n" +
                    "                    \"web_url\": \"http://www.daum.net\",\n" +
                    "                    \"mobile_web_url\": \"http://m.daum.net\"\n" +
                    "                }\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"title\": \"앱으로 이동\",\n" +
                    "                \"link\": {\n" +
                    "                    \"android_execution_params\": \"contentId=100\",\n" +
                    "                    \"ios_execution_params\": \"contentId=100\"\n" +
                    "                }\n" +
                    "            }\n" +
                    "        ]\n" +
                    "    }";
        }
    }


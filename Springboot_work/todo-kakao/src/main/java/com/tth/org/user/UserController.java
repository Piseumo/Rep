package com.tth.org.user;

import com.tth.org.kakao.jpa.KakaoEntity;
import com.tth.org.kakao.jpa.KakaoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user"  )
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final KakaoRepository kakaoRepository;

    @GetMapping("info")
    public ResponseEntity<KakaoEntity> getUserInfo(
            @AuthenticationPrincipal UserDetails userDetails){
        KakaoEntity kakaoEntity = kakaoRepository.findByEmail(userDetails.getUsername());

        return ResponseEntity.ok(kakaoEntity);
    }

}

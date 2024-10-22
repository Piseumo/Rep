package com.tth.org.kakao;

import com.tth.org.kakao.dto.KakaoMessageDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kakao")
@Slf4j
@CrossOrigin
@RequiredArgsConstructor
public class KakaoController {

    private final KakaoService kakaoService;

    @GetMapping("login")
    public String kakaoCode(@RequestParam(name = "code") String code) {
        log.info("code: {}", code);

        kakaoService.getToken(code);
        return "kakao join success";
    }

    @PostMapping("messageSend")
    public String messageSend(@RequestBody KakaoMessageDto kakaoMessageDto){
        kakaoService.messageSend(
                kakaoMessageDto.getEmail(),
                kakaoMessageDto.getMessage());
        return "message send success";

    }


}

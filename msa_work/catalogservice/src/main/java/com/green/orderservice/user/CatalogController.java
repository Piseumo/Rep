package com.green.orderservice.user;

import com.green.orderservice.user.service.CatalogService;
import com.green.orderservice.user.vo.CatalogRequestDto;
import com.green.orderservice.user.vo.CatalogResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class CatalogController {

    private final CatalogService catalogService;

    @GetMapping("join")
    public ResponseEntity<CatalogResponseDto> joinUser(@RequestBody CatalogRequestDto catalogRequestDto) {
        catalogService.join(catalogRequestDto);
        return ResponseEntity.ok(null);
    }

    @GetMapping("login")
    public ResponseEntity<String> getUser() {

        return ResponseEntity.ok(null);
    }

    @GetMapping("kakologin")
    public ResponseEntity<String> kakaoLogin() {

        return ResponseEntity.ok(null);
    }
}

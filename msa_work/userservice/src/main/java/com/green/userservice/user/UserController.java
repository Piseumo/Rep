package com.green.userservice.user;

import com.green.userservice.user.jpa.UserEntity;
import com.green.userservice.user.service.UserService;
import com.green.userservice.user.vo.UserRequestDto;
import com.green.userservice.user.vo.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("join")
    public ResponseEntity<UserResponseDto> joinUser(@RequestBody UserRequestDto userRequestDto) {
        userService.join(userRequestDto);
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

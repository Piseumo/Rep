package com.green.userservice.user;

import com.green.userservice.user.service.UserService;
import com.green.userservice.user.vo.UserRequestDto;
import com.green.userservice.user.vo.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("join")
    public ResponseEntity<UserResponseDto> joinUser(@RequestBody UserRequestDto userRequestDto) {
        UserResponseDto userResponseDto = userService.join(userRequestDto);
        return ResponseEntity.ok(userResponseDto);
    }

    @GetMapping("list")
    public ResponseEntity<List<UserResponseDto>> listUser(){
        return ResponseEntity.ok(userService.list());
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

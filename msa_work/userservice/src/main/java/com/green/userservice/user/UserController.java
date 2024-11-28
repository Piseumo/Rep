package com.green.userservice.user;

import com.green.userservice.feign.FirstClient;
import com.green.userservice.user.service.UserService;
import com.green.userservice.user.vo.UserRequestDto;
import com.green.userservice.user.vo.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user-service")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final FirstClient firstClient;

    @GetMapping("test")
    public String test(){
        System.out.println("통신 시작");
        System.out.println(firstClient.getTest());
        System.out.println("통신끝");
        return "UserService";
    }

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

    @GetMapping("getuser/{userId}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable(value = "userId")String userId) {
        UserResponseDto userResponseDto = userService.getUser(userId);
        return ResponseEntity.ok(userResponseDto);
    }

    @GetMapping("kakologin")
    public ResponseEntity<String> kakaoLogin() {

        return ResponseEntity.ok(null);
    }
}

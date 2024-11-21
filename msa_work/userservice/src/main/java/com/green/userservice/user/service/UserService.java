package com.green.userservice.user.service;

import com.green.userservice.user.vo.LoginResponse;
import com.green.userservice.user.vo.UserRequestDto;
import com.green.userservice.user.vo.UserResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserResponseDto join(UserRequestDto userRequestDto);
    LoginResponse login(String email, String password);
    List<UserResponseDto> list();
}

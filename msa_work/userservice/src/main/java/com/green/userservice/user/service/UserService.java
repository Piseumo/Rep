package com.green.userservice.user.service;

import com.green.userservice.user.vo.UserRequestDto;
import com.green.userservice.user.vo.UserResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponseDto join(UserRequestDto userRequestDto);
}

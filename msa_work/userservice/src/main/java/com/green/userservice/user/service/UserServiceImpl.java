package com.green.userservice.user.service;

import com.green.userservice.user.jpa.UserEntity;
import com.green.userservice.user.jpa.UserRepository;
import com.green.userservice.user.vo.UserRequestDto;
import com.green.userservice.user.vo.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponseDto join(UserRequestDto userRequestDto) {
        String reqEmail = userRequestDto.getEmail();

        userRepository.findByEmail(reqEmail)
                .ifPresent(uesr-> {
                    throw new IllegalArgumentException(String.format("이미 존재하는 이메일 입니다 회원가입 안됩니다.",reqEmail));
                });

        ModelMapper modelMapper = new ModelMapper();
        UserEntity userEntity = modelMapper.map(userRequestDto, UserEntity.class);
        userEntity.setUserId(UUID.randomUUID().toString());
        userEntity = userRepository.save(userEntity);

        UserResponseDto userResponseDto =modelMapper.map(userEntity, UserResponseDto.class);
        return userResponseDto;
    }
}

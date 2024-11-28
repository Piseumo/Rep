package com.green.userservice.user.service;

import com.green.userservice.error.UserException;
import com.green.userservice.feign.OrderClient;
import com.green.userservice.jwt.JwtUtils;
import com.green.userservice.user.jpa.UserEntity;
import com.green.userservice.user.jpa.UserRepository;
import com.green.userservice.user.vo.LoginResponse;
import com.green.userservice.user.vo.OrderResponse;
import com.green.userservice.user.vo.UserRequestDto;
import com.green.userservice.user.vo.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final JwtUtils jwtUtils;
    private final OrderClient orderClient;


    @Override
    public UserResponseDto join(UserRequestDto userRequestDto) {
        String reqEmail = userRequestDto.getEmail();
        userRepository.findByEmail(reqEmail)
                .ifPresent(uesr-> {
                    throw new UserException(String.format("이미 존재하는 이메일 입니다 회원가입 안됩니다.",reqEmail));
                });

        ModelMapper modelMapper = new ModelMapper();
        UserEntity userEntity = modelMapper.map(userRequestDto, UserEntity.class);
        userEntity.setUserId(UUID.randomUUID().toString());
        userEntity = userRepository.save(userEntity);

        UserResponseDto userResponseDto =modelMapper.map(userEntity, UserResponseDto.class);
        return userResponseDto;
    }


    @Override
    public LoginResponse login(String email, String password) {

        UserEntity userEntity =
                userRepository.findByEmailAndPassword(email, password)
                        .orElseThrow(() -> new UserException("Invalid email or password"));

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setUserId(userEntity.getUserId());
        loginResponse.setAccessToken(jwtUtils.createAccessToken(userEntity.getEmail(), userEntity.getUserId()));
        loginResponse.setRefreshToken(jwtUtils.createRefreshToken(userEntity.getEmail()));
        loginResponse.setEmail(userEntity.getEmail());

        return loginResponse;
    }

    @Override
    public List<UserResponseDto> list(){
        List<UserEntity> list = userRepository.findAll();
        List<UserResponseDto> userResponses = new ArrayList<>();
        list.forEach(userEntity ->
            userResponses.add(new ModelMapper().map(userEntity,UserResponseDto.class))
        );
        return userResponses;
    }

    @Override
    public UserResponseDto getUser(String userId) {
        UserEntity userEntity = userRepository.findByUserId(userId).orElseThrow(
                () -> new UserException(String.format("User with id %s not found id", userId))
        );
        UserResponseDto userResponseDto = new ModelMapper().map(userEntity, UserResponseDto.class);
        List<OrderResponse> orderResponses = orderClient.getOrders(userId);
        userResponseDto.setOrderResponses(orderResponses);
        return userResponseDto;
    }


}


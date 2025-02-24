package com.green.userservice.user.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserResponseDto {
    private Long id;

    private String email;

    private String userId;

    private String name;

    private String password;

    private List<OrderResponse> orderResponses;

}

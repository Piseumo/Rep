package com.green.userservice.user.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserResponseDto {
    private Long id;

    private String email;

    private Long userId;

    private String name;

    private String password;

    private String thumb;
}

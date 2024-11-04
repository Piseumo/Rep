package com.green.userservice.user.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequestDto {

    @Schema(hidden = true)
    private Long id;

    @NotNull(message ="Email is required")
    @Email
    @Schema(example = "user@example.com"  )
    private String email;
    
    @Schema(hidden = true)
    private Long userId;

    @Schema(example = "탁길동")
    private String name;

    @NotNull(message ="Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    @Schema(example = "password123456")
    private String password;

    private String thumb;

}

package com.tth.ex04.user;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class UserReqDto {
    private Long idx;

    private String name;
    private int age;

    @NotEmpty
    private String email;
    @NotEmpty
    private String password;

    private LocalDateTime wdate;
}

package com.tth.ex08.freeboard;

import com.tth.ex08.user.User;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class FreeBoardReponseDto {

    private Long idx;
    private String title;
    private String content;
    private User user;
    private String creAuthor;
    private String modAuthor;


    private String regDate;
    private String modDate;

    private int viewCount;
}

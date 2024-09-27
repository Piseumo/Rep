package com.tth.ex10.freeboard;

import com.tth.ex10.file.FileReqDto;
import com.tth.ex10.user.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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

    private List<FileReqDto> list = new ArrayList<>();
}

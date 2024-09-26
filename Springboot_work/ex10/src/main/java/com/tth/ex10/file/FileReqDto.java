package com.tth.ex10.file;

import com.tth.ex10.freeboard.FreeBoard;
import lombok.Data;

@Data
public class FileReqDto {

    private Long idx;

    private String name;

    private String path;

    private String fileDesc;

    private FreeBoard freeBoard;
}

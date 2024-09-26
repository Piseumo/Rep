package com.tth.ex10.file;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("file")
@CrossOrigin
public class FileController {

    private final Path imagepath;
    private final FileRepository fileRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public FileController(FileRepository fileRepository,ModelMapper modelMapper) {
        this.imagepath = Paths.get("images/file/").toAbsolutePath();
        this.fileRepository = fileRepository;
        this.modelMapper = modelMapper;

        try {
            Files.createDirectories(this.imagepath);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @GetMapping("test")
    public String test(){
    return "test";
    }

    @PostMapping(value = "upload",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String upload(@RequestPart(name = "file")MultipartFile file,
                         @RequestPart(name = "fileDto")FileReqDto fileReqDto) {

        System.out.println("일로오나");

        try {
        String myFilePath = imagepath.toAbsolutePath()+"\\"+file.getOriginalFilename();

        File saveFile = new File(myFilePath);
        file.transferTo(saveFile);

        FileEntity fileEntity = modelMapper.map(fileReqDto,FileEntity.class);
        fileRepository.save(fileEntity);

        }catch (Exception e){
            e.printStackTrace();
        }
        return "upload";
    }

}

package com.tth.ex10.freeboard;

import com.tth.ex10.error.BizException;
import com.tth.ex10.error.ErrorCode;
import com.tth.ex10.file.FileEntity;
import com.tth.ex10.file.FileRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;
    private final FileRepository fileRepository;
    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<FreeBoardResponsePageDto> findALl(@RequestParam(name = "pageNum",defaultValue = "0") int pageNum
            ,@RequestParam(name = "size",defaultValue = "5")int size){

        Sort sort = Sort.by(Sort.Direction.DESC,"idx");

        Pageable pageable = PageRequest.of(pageNum,size,sort);

        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);

        FreeBoardResponsePageDto freeBoardResponsePageDto
                = new ModelMapper()
                .map(page, FreeBoardResponsePageDto.class);

        List<FreeBoardReponseDto> list = new ArrayList<>();

        for(FreeBoard freeBoard : freeBoardResponsePageDto.getContent()){
            FreeBoardReponseDto freeBoardReponseDto
             = new ModelMapper().map(freeBoard,FreeBoardReponseDto.class);

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");

            freeBoardReponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
            freeBoardReponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

            list.add(freeBoardReponseDto);
        }
        freeBoardResponsePageDto.setList(list);

        return ResponseEntity.ok(freeBoardResponsePageDto);
    }

    @GetMapping("view/{idx}")
    public ResponseEntity<FreeBoardReponseDto> findOne(@PathVariable(name = "idx") long idx){
        //해당되는행찾고
        FreeBoard freeBoard = freeBoardRepository.findById(idx).orElseThrow(()->new BizException(ErrorCode.NOT_FOUND));
        //수정하고
        freeBoard.setViewCount(freeBoard.getViewCount()+1);
        freeBoardRepository.save(freeBoard);

        FreeBoardReponseDto freeBoardReponseDto = modelMapper.map(freeBoard,FreeBoardReponseDto.class);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");
        freeBoardReponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
        freeBoardReponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

        return ResponseEntity.ok(freeBoardReponseDto);
    }

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public ResponseEntity<FreeBoard> save(
            @Valid @RequestPart(name = "data") FreeBoardReqDto freeBoardReqDto,
            @RequestPart(name = "file",required = false)MultipartFile file){
            //글수정
        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto,FreeBoard.class);
        freeBoardRepository.save(freeBoard);

        if( file != null) {
            //파일저장
            String myFilePath = Paths.get("images/file/").toAbsolutePath()+"\\"+file.getOriginalFilename();
            try {
            File destFile = new File(myFilePath);
            file.transferTo(destFile);
            }catch (Exception e){
                e.printStackTrace();
            }
            //파일행삽입
            FileEntity fileEntity = new FileEntity();
            fileEntity.setName(file.getOriginalFilename());
            fileEntity.setPath(Paths.get("images/file/").toAbsolutePath().toString());
            fileEntity.setFreeBoard(freeBoard);
            fileRepository.save(fileEntity);
        }


        return ResponseEntity.status(200).body(freeBoard);
    }

    @DeleteMapping("delete/{idx}")
    public ResponseEntity<String> deleteById(@PathVariable(name="idx")long idx){
        freeBoardRepository.findById(idx).orElseThrow(()->new BizException(ErrorCode.NOT_FOUND));
        freeBoardRepository.deleteById(idx);
        return ResponseEntity.ok("삭제되었습니다.");
    }



}

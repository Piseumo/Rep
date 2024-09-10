package com.tth.ex03.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select(){
        return userRepository.findAll();
    }
    @PostMapping("insert")
    public String insert(@RequestBody User user){
        user.setWdate(LocalDateTime.now());
            System.out.println("실행");
//            User user = User.builder()
//                    .name("홍길동")
//                    .age(20)
//                    .email("aaa@naver.com")
//                    .password("password")
//                    .wdate(LocalDateTime.now())
//                    .build();
            userRepository.save(user);
        return "ok";
    }
}

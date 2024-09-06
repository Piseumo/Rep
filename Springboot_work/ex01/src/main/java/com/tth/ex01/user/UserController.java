package com.tth.ex01;

import com.tth.ex01.member.MemberRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @GetMapping("member/insert")
    public String aa(@RequestParam(name = "name", defaultValue = "박박박") String name,
                     @RequestParam(name = "age",defaultValue = "30") int age){
        System.out.println("name= "+name);
        System.out.println("age= "+age);
        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insert(name,age);
        return "memberTable 저장했습니다";
    }
    @GetMapping("bb")
    public String bb(){
        return "bb";
    }
}

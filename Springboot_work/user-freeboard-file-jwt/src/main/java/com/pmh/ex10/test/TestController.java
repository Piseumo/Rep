package com.pmh.ex10.test;

import com.pmh.ex10.JWT.JWTManager;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")

public class TestController {

    private final Environment environment;
    private final String secretKey;
    private final JWTManager jwtManager;

    public TestController(Environment environment, JWTManager jwtManager){
        this.environment = environment;
        this.secretKey = environment.getProperty("spring.jwt.secret");
        this.jwtManager = jwtManager;
        System.out.println("secretKey : " + secretKey);
    }

    @GetMapping("maketoken")
    public String maketoken(){
        String jwt = jwtManager.createJWT(secretKey);
        return "maketoken" + jwt;
    }


    @GetMapping("validtoken")
    public String validtoken(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorization){

        System.out.println("authorization" + authorization);
        String result = jwtManager.validJWT(authorization.split(" ")[1],secretKey);
        return "validtoken" + result;
    }

}

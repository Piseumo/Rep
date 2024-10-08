package com.pmh.ex10.JWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Date;

@Component
public class JWTManager {

//JWT생성
    public String createJWT(String secretkey){
        String jwt = Jwts.builder()
                .claim("name","piseumo")
                .claim("role","ADMIN")
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
//                .expiration(new Date(System.currentTimeMillis() + 1000))
                .signWith(SignatureAlgorithm.HS256,
                        Base64.getEncoder().encodeToString(secretkey.getBytes()))
                .compact();
        return jwt;
    }
    //JWT 유효한지 검사, 우리가 설정한 비밀번호도 같이
    public  String validJWT(String jwt,String secretkey){
        try {
            SecretKey secretKey
                    = new SecretKeySpec(secretkey.getBytes(),
                    Jwts.SIG.HS256.key().build().getAlgorithm());
            Jws<Claims> claims = Jwts.parser()
                    .verifyWith(secretKey)
                    .build()
                    .parseSignedClaims(jwt);
            claims.getPayload().getExpiration().before(new Date());
        } catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
        return "success";
    }
}

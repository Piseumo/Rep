package com.pmh.ex10.login;

import com.pmh.ex10.JWT.JWTManager;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

public class LoginFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;
    private final JWTManager jwtManager;

    public LoginFilter(AuthenticationManager authenticationManager, JWTManager jwtManager) {
        // get 방식 추가
        this.setFilterProcessesUrl("/login");
        this.authenticationManager = authenticationManager;
        this.jwtManager = jwtManager;

    }

    // 로그인 시도 할때 호출 되는 메서드
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("로그인시도");
        
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
                = new UsernamePasswordAuthenticationToken(username, password);
        return authenticationManager.authenticate(
                usernamePasswordAuthenticationToken);
    }

    // login success -> JWT 토큰발행
    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {
        System.out.println(authResult);
        System.out.println(authResult.getPrincipal().toString());
        System.out.println(authResult.getCredentials().toString());
        System.out.println(authResult.getAuthorities().toString());
//        super.successfulAuthentication(request, response, chain, authResult);
        System.out.println("성공");
        response.getWriter().write("Login Success");
    }

    // login fail -> username password 를 확인하세요..
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request,
                                              HttpServletResponse response,
                                              AuthenticationException failed) throws IOException, ServletException {
//        super.unsuccessfulAuthentication(request, response, failed);
        System.out.println("실패");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getWriter().write("Check ID and password");
    }
}

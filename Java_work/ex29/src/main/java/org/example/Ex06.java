package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        try(Connection conn
             = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/tth","root","1234")) {
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM member ORDER BY IDX DESC");
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()){
            Member member = Member.builder()
                    .name(rs.getString("name"))
                    .idx(rs.getInt("idx"))
                    .age(rs.getInt("age"))
                    .email(rs.getString("email"))
                    .password(rs.getString("password"))
                    .regdate(rs.getObject("regdate", LocalDateTime.class))
                    .mydate(rs.getObject("mydate",LocalDateTime.class))
                    .build();
            list.add(member);
        }

            list.stream()
                    .forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}

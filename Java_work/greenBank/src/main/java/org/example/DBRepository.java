package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DBRepository {
    Scanner scan = new Scanner(System.in);

    //연결
    public void insert(){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/greenBank",
                    "root","1234");
            pstmt = conn.prepareStatement(
                    "insert into member(name,age) values(?,?)"
            );
            System.out.println("이름을 입력하세요");
            pstmt.setString(1, scan.nextLine());
            System.out.println("나이를 입력하세요");
            pstmt.setInt(2, scan.nextInt());

            pstmt.executeUpdate();
            System.out.println("입력이 완료 되었습니다");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void select(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/greenBank",
                    "root","1234");
            pstmt = conn.prepareStatement("select * from member");
            rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println("""
                        idx = %d
                        name = %s
                        age = %d
                        """.formatted(rs.getInt("idx"),
                            rs.getString("name"),
                            rs.getInt("age")));
            }
            System.out.println("조회가 완료 되었습니다");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void update() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/greenBank",
                    "root", "1234");

            pstmt = conn.prepareStatement("update member set name = ?, age = ? where idx = ?");

            System.out.print("업데이트 할 이름: ");
            String name = scan.nextLine();
            pstmt.setString(1, name);

            System.out.print("업데이트 할 나이: ");
            int age = scan.nextInt();
            pstmt.setInt(2, age);

            System.out.print("idx 번호: ");
            int idx = scan.nextInt();
            pstmt.setInt(3, idx);

            // executeUpdate가 영향을 미친 행의 수를 반환합니다.
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("업데이트된 행의 수: " + rowsAffected);

            if (rowsAffected > 0) {
                System.out.println("업데이트 완료 되었습니다");
            } else {
                System.out.println("업데이트할 데이터가 없습니다. idx 값을 확인하세요.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void delete(){

    }



    // insert
    // select
    // update
    // delete
    // close

}

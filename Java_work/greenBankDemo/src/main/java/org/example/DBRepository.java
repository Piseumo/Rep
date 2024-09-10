package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DBRepository {
    Scanner scan = new Scanner(System.in);

    public void myPage() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/GreenBank",
                    "root", "1234");
            PreparedStatement pstmt = conn.prepareStatement("select * from Users where u_id = (?)");
            System.out.print("조회할 아이디를 입력하세요 : ");
            String usersID = scan.nextLine();
            pstmt.setString(1, usersID);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("""
                        아이디 = %s
                        비밀번호 = %s
                        이름 = %s
                        전화번호 = %s
                        """.formatted(
                        rs.getString("u_id"),
                        rs.getString("u_password"),
                        rs.getString("u_name"),
                        rs.getString("u_phone")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void editInformation() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/GreenBank",
                    "root",
                    "1234");
            PreparedStatement pstmt = conn.prepareStatement("update Users set u_password = ?,u_phone =? where u_id = ?");

            System.out.print("아이디를 입력하세요 : ");
            String usersID = scan.nextLine();
            pstmt.setString(3, usersID);
            System.out.print("변경 비밀번호: ");
            String password = scan.nextLine();
            pstmt.setString(1, password);
            System.out.print("변경 연락처: ");
            String phoneNum = scan.nextLine();
            pstmt.setString(2, phoneNum);
            System.out.println("변경 완료 되었습니다.");

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void checkMyAccount() {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/GreenBank",
                    "root", "1234");
            PreparedStatement pstmt = conn.prepareStatement("select * from Users where u_id = (?)");
            System.out.print("조회할 아이디를 입력하세요 : ");
            String usersID = scan.nextLine();
            pstmt.setString(1, usersID);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("""
                        아이디 = %s
                        비밀번호 = %s
                        이름 = %s
                        전화번호 = %s
                        """.formatted(
                        rs.getString("u_id"),
                        rs.getString("u_password"),
                        rs.getString("u_name"),
                        rs.getString("u_phone")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void depositWithdraw () {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/GreenBank",
                    "root", "1234");
            PreparedStatement pstmt = conn.prepareStatement("select * from Accounts where a_number = ?");
            boolean done = false;
            while(!done) {
                System.out.println("입출금을 진행 하실 계좌번호를 입력하세요");
                String accountNumbers = scan.nextLine();
                pstmt.setString(1, accountNumbers);
                ResultSet rs = pstmt.executeQuery();
                boolean row = true;
                while (rs.next()) {
                    System.out.println("""
                            현재 귀하의 %s 계좌의 현재 잔액은 : %d 원 입니다.
                            """.formatted(rs.getString("a_number"),
                            rs.getInt("a_balance")
                    ));
                    row = false;
                }
                if (row) {
                    System.out.println("없는 계좌번호입니다. 다시 적어주시길 바랍니다.");
                    continue;
                }
                while (true){
                   System.out.println("입금은 1번 출금은 2번을 입력해 주세요");
                   if (!scan.hasNextInt()){
                       System.out.println("숫자만 입력하세요");
                       scan.next();
                       continue;
                   }
                    int choice = scan.nextInt();
                    if (choice == 1 || choice == 2) {
                        System.out.println("입금할 금액을 입력하세요");
                        int balances = scan.nextInt();
                        String sql = choice == 1 ?"update Accounts set a_balance = a_balance + ? where a_number = ?":
                                                  "update Accounts set a_balance = a_balance - ? where a_number = ?";
                        PreparedStatement calc = conn.prepareStatement(sql);
                        calc.setInt(1, balances);
                        calc.setString(2, accountNumbers);
                        calc.executeUpdate();

                        pstmt = conn.prepareStatement("select * from Accounts where a_number = ?");
                        pstmt.setString(1, accountNumbers);
                        rs = pstmt.executeQuery();
                        if (rs.next()) {
                            System.out.println("""
                                입금 후 귀하의 %s 계좌의 현재 잔액은 : %d 원 입니다.
                                """.formatted(accountNumbers, rs.getInt("a_balance")));
                        }

                        done = true;
                        break;

                    } else {
                        System.out.println("잘못 입력 하셨습니다.");
                        }

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        }
    }


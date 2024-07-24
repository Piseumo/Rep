package org.example.Exercise.Ex0723;

import java.util.InputMismatchException;
import java.util.Scanner;
// interface
// 변수 public static final 안적어도됨
// int A
// 몸체가 없는 메서드 public 안적어도됨
// void doA();
//
// class만들어서 interface 상속 받아야됨
// doA()메서스 제정의
// dafault() static() 추가 가능하다
// 메서드 안에 내용이 존재할 수..있음
// default() > new 사용해도 되는 것
// static() > printable.doA()
// 람다 규칙은
// interface 하나의 추상메서드가 존재한다.
//() > {}
// 도커데스크탑 데이터베이스 유효함 MYSQL설치
// docker run 명령어 설치

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("나누기 시작");
        try {
            System.out.println("a : ");
        int a = scan.nextInt();
            System.out.println("b : ");
        int b = scan.nextInt();
            System.out.println(a / b);
            int[] c = new int[3];
            System.out.println(c[4]);

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("0으로 나눌 수 없습니다");
        }
        catch (InputMismatchException i){
            System.out.println("한글 넣으면 안되요..");
        }
        catch (Exception ei){
            System.out.println("이것은 모든 예외 상황");
        }
        System.out.println("정상 종료 되었습니다");
    }
}

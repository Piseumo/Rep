package org.example;

public class Ex04 {
    public static void main(String[] args) {

//throw예외생성
//throws 예외전달
        try {
            throw new MyException(
                    new ErrorCode("id를 입력하세요","A101","ID는 영어로 입력해야합니다")
            );
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

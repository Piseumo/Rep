package org.example.Exercise.Ex0718;

public class Ex03 {
    public static void doA(){
        System.out.println("안녕하셍");
    }
    public static void main(String[] args) {
        BizMan bm = new BizMan("홍길동","그린컴퓨터 흠","선생님");
        bm.showInfo();
        doA();

    }
}

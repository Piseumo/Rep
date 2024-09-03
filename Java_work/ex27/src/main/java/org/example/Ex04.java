package org.example;

interface AA{
    void doA();
}

public class Ex04 {

    public static void doMethod(AA aa){
        aa.doA();
    }


    public static void main(String[] args) {
        //doMethod( ()->System.out.println("새로운 함수정의"));
    }
}

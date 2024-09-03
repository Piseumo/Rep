package org.example;

interface Calculate{
    void cal(int a , String b);
}

public class Ex01 {
    public static void main(String[] args) {
        Calculate c = new Calculate() {
            @Override
            public void cal(int a , String b){
                System.out.println("계산");
                System.out.println("a =" + a);
                System.out.println("b =" + b);

            }
        };
        c.cal(10,"문자열");

        Calculate c2 = (a,b)->{
            System.out.println("람다계산");
        };
        c2.cal(10,"람다");

        c2 = (a,b)->{
            System.out.println("새로운람다");
        };
        c2.cal(20,"새로운람다");
    }
}

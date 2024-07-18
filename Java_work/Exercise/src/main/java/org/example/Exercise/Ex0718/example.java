package org.example.Exercise.Ex0718;

public class example {

    example(){
        Box box = new Box("마이박스");
        System.out.println(box);
        System.out.printf("%s\n","문자열출력");
        int a = 10;
        int b = 20;
        System.out.printf("%d\n",a);
        System.out.printf("%f\n",(double)a);
        System.out.printf("%o\n",a);
        System.out.printf("%x\n",a);

        System.out.println(String.format("%d + %d = %d",a,b,a+b));
    }

    public static void main(String[] args) {
        new example();
    }
}

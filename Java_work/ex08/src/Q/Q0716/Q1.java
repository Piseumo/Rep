package Q.Q0716;
//1. "Hello.java" 문자열에서 파일명은 Hello와 확장자인 java를 분리시켜보자.
//
//입력 >>Hello.java
//        출력
//파일명 Hello
//확장자 java
//
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

        String str = "Hello.java";
        String temp[] = str.split("\\.");

        System.out.println(Arrays.toString(temp));

        str = "Hello.java";
        temp = str.split("[A~Z]");

        System.out.println(Arrays.toString(temp));

        if (temp[0].equals("exe"));
        return;



    }
}

package org.example.Q.Q0723;
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서,
//홀수와 짝수를 구분 지어 출력하는 프로그램을 작성해 보자.
//일단 홀수부터 출력하고 나서 짝수를 출력하도록 하자.
//단, 10개의 정수는 main 함수 내에서 입력받도록 하고,
//배열 내에 존재하는 홀수만 출력하는 함수와 배열 내에 존재하는 짝수만 출력하는 함수를 각각 정의해서
//이 두 함수를 호출하는 방식으로 프로그램을 완성하자.

import java.util.Arrays;
import java.util.Scanner;

public class Q1_1 {

    static int odd1(int arr){
            int a = 0;
            if (arr%2 != 0){
                a = arr;
                System.out.println(a);
            }
        return a;
    }
    public static void main(String[] args) {
    int[] arr = new int[10];
    Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int result =0;
        odd1(result);
        //짝수 출력
    }
}

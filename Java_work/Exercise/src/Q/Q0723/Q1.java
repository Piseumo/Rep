package org.example.Q.Q0723;

import java.util.Arrays;
import java.util.Scanner;
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서,
//홀수와 짝수를 구분 지어 출력하는 프로그램을 작성해 보자.
//일단 홀수부터 출력하고 나서 짝수를 출력하도록 하자.
//단, 10개의 정수는 main 함수 내에서 입력받도록 하고,
//배열 내에 존재하는 홀수만 출력하는 함수와 배열 내에 존재하는 짝수만 출력하는 함수를 각각 정의해서
//이 두 함수를 호출하는 방식으로 프로그램을 완성하자.
public class Q1 {

    public static void odd(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("홀수는" + arr[i]);
            }
        }
    }
    public static int[] even(int[] arr){
           int [] result = new int[10];
            int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                    result[j++] = arr[i];
            }
        }
        result = Arrays.copyOf(result,j);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("10개의  정수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; arr.length>i ; i++) {
            arr[i] = scan.nextInt();
        }
        odd(arr);
        System.out.println("짝수는"+Arrays.toString(even(arr)));
    }
}

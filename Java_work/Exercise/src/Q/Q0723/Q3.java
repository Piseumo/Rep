package org.example.Q.Q0723;

import java.util.Arrays;
import java.util.Scanner;

//7개의 정수를 입력받아 내림차순으로 정렬하는 프로그램을 만들어라
//        사용자가
//6,9,15,3,2,11,20 입력했다면
//20,15,11,9,6,3,2 출력되어야 한다.
public class Q3 {

    static void line(int[] num){
        int[] result = new int[7];
        for (int i = 0; i < num.length; i++) {
            result[i] = num[i];
            if(result[0]>result[i]){

        }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

    }
}
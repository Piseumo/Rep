package org.example.Q.Q0723;

import java.util.Arrays;
import java.util.Scanner;
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받는다.
//        단, 입력받은 숫자가 홀수이면 배열의 앞에서부터 채워나가고,
//짝수이면 뒤에서부터 채워나가는 형식을 취하기로 하자.
//따라서 사용자가 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]을 입력했다면,
//배열에는 [1, 3, 5, 7, 9, 10, 8, 6, 4, 2]의 순으로 저장이 되어야 한다.
public class Q2 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] result = new int[10];
        int j = 0;
        int k = 9;
        Scanner scan = new Scanner(System.in);
        System.out.println("10개의 정수를 입력하세요");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 2 != 0) {
                result[j++] = arr[i];//result배열 안의 0부터 4까지 arr 배열값 중 짝수값을 큰 순서대로 집어넣는다
            }
            else if (arr[i] % 2 == 0) {
                result[k--] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));

    }
}

package Exercise.src.Q.Q0723;
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서,
//홀수와 짝수를 구분 지어 출력하는 프로그램을 작성해 보자.
//일단 홀수부터 출력하고 나서 짝수를 출력하도록 하자.
//단, 10개의 정수는 main 함수 내에서 입력받도록 하고,
//배열 내에 존재하는 홀수만 출력하는 함수와 배열 내에 존재하는 짝수만 출력하는 함수를 각각 정의해서
//이 두 함수를 호출하는 방식으로 프로그램을 완성하자.

import java.util.Arrays;
import java.util.Scanner;

public class Q1_1 {
//        예전에 풀었던 방법



// 매개변수에 배열을 받아서 배열 타입으로 반환하기
//static int[] evenArray(int[] arr){
//    int[] result = new int[10];
//    int j = 0;
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i]%2 == 0){
//            result[j++]=arr[i];
//            //result[i]=arr[i]; => [0, 2, 0, 4, 0, 6, 0, 8, 0, 10]
//            //이 배열에서 짝수만 골라서 result 배열에 넣자
//            //짝수일때만 j의 값이 1씩 올라가게 == 짝수일때만 if구문이 동작하니..
//        }
//    }
//    result = Arrays.copyOf(result,j);
//    return result;
//}
//// 매개변수에 배열을 받아서 int 데이터 타입으로 반환하기
//static int oddInt(int[] arr) {
//    System.out.print("홀수는 : ");
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i]%2 != 0) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//    return 9999999;
//}
public static void main(String[] args) {
    int[] numbers = new int[10];
    int[] oddResult = new int[10];
    int[] evenResult = new int[10];
    Scanner scan = new Scanner(System.in);
    System.out.println("10개의 정수를 입력하세요");
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = scan.nextInt();
        if (numbers[i]%2 != 0){
            oddResult[i]=numbers[i];
        }
        if (numbers[i]%2 == 0){
            evenResult[i]=numbers[i];
        }
    }
            System.out.print("홀은"+Arrays.toString(oddResult));
            System.out.print("짝은"+Arrays.toString(evenResult));
}
}

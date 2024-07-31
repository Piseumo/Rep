package Ex0728;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
    //        예전에 풀었던 방법
    static void oddVoid(int[] arr){
        System.out.print("홀수는 :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    // 매개변수에 배열을 받아서 배열 타입으로 반환하기
    static int[] evenArray(int[] arr){
        int[] result = new int[10];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                result[j++]=arr[i];
                //result[i]=arr[i]; => [0, 2, 0, 4, 0, 6, 0, 8, 0, 10]
                //이 배열에서 짝수만 골라서 result 배열에 넣자
                //짝수일때만 j의 값이 1씩 올라가게 == 짝수일때만 if구문이 동작하니..
            }
        }
        result = Arrays.copyOf(result,j);
        return result;
    }
    // 매개변수에 배열을 받아서 int 데이터 타입으로 반환하기
    static int oddInt(int[] arr) {
        System.out.print("홀수는 : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
        return 9999999;
    }
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("10개의 정수를 입력하세요");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
//      oddVoid(numbers);

        int[] evenResult = evenArray(numbers);
        System.out.println("짝수는 : "+Arrays.toString(evenResult));

        oddInt(numbers);
//            int oddResult = oddInt(numbers);//변수 값에 넣어주기만 해도 출력이..?
//            System.out.println("리턴값을 받아 출력하면.. ="+oddResult);
    }
}

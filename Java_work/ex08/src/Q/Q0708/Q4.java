package Q;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
    //4.두 개의 정수를 입력받아서 최대 공약수(GCD)를 구하는 프로그램을 작성해 보자.
        Scanner scan = new Scanner(System.in);
        System.out.println("첫 번째 수를 입력 하시오");
        int a = scan.nextInt();
        System.out.println("두 번째 수를 입력 하시오");
        int b = scan.nextInt();
        int gcd = 0;

        for(int n = 1; n < 100; n++) {
            if (a % n == 0 && b % n == 0) {
                gcd = n;
            }

        }
        System.out.println("최대공약수= " +gcd);


    }

}



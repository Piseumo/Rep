package ex03;

import java.util.Scanner;

public class Ex03 {
	// 두 수를 입력받아 곱과 나누기, 몫을 구하시오
	public static void main(String[] args) {
		Scanner clac = new Scanner(System.in);

		int a;
		int b;

		System.out.println("숫자 입력 : ");
		a = clac.nextInt();
		b = clac.nextInt();

		System.out.println("a * b = " + a * b);
		System.out.println(a + "*" + b + a * b);
		System.out.println("a / b = " + a / b);
		System.out.println("a % b = " + a % b);
		
	}

}

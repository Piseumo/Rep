package ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 숫자를 입력받아 두 수의 합을 구하시고
		int a;
		a = 10;
		int b;
		// 무엇인을 입력받아 사용할떄 쓰는 문법
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");

		// a변수에 숫자 입력 받아 넣는 구문
		a = scan.nextInt();
		System.out.println("a = " + a);
		System.out.println(a);
		b = scan.nextInt();
		System.out.println("b=" + b);

	}

}

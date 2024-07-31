package ex05;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// 계속 입력받아서 진행...

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		while (true) {
			System.out.println("num = " + num);

			if (num == 0) {
				break;
			}
		}
		System.out.println("종료됩니다");
	}

}

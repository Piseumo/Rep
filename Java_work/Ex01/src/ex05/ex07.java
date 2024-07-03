package ex05;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		System.out.println("temp = " + temp);
	
		
//		int n = 0;

		while(true) {
			n++;
			System.out.println("n =" + n);
			if (n==10)
				break;
		}
		System.out.println("종료됩니다");
	}

}

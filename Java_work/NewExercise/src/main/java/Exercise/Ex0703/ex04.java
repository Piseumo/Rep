package ex05;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int a = c.nextInt();
		
		switch(a) {
		case 0: 
			System.out.println("안녕하세요");
		case 5: 
			System.out.println("감사합니다");
		case 9: 
			System.out.println("반갑습니다");
			break;
		default:
			System.out.println("Do the best");
		}
		System.out.println("끝");
	}

}

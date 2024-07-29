package ex04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//숫자를 입력받아 10 미만이면 10 미만 출력
		//10이상이고 20이하면 10이상 20이하 추력
		//20초과 이면 20초과 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		
		int a = scan.nextInt();
		
		if(a<10) {
			System.out.println("10미만");
		}
		
		else if((10 <= a ) && (a <= 20)) {
			System.out.println("10이상 20이하");
		}
		
		else {
			System.out.println("20초과");
		}
		
		
		
		

	}

}

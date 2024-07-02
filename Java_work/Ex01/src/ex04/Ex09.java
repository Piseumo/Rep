package ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		//아래는 변수 num의 값에 따라 '양수','음수','0'을 출력하는 코드이다. 삼향 연산자를 이용해서 1(에) 알맞은 값을 쓰시오
		
		Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 넣으세요: ");
		int num = scan.nextInt();
		
		if(num>0 || num<0) {
		System.out.println(num>=1 ? "양수":"음수");
		}
		else {
			System.out.println(0);	
		}		
		
		
	
	

	}

}

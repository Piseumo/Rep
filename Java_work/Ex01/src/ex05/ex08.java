package ex05;

public class ex08 {

	public static void main(String[] args) {
		// 3,4의 최소공배수
		// 3과 4로 나누었을떄 0으로 떨어지는 수
		
		for(int num = 1; num<100; num++) {
		
	//	System.out.println("num = " +num);
		
		if(num%3 == 0 && num%4 == 0) { 
			System.out.println("num = " +num);
		
		break;
		}
		}
	}

}

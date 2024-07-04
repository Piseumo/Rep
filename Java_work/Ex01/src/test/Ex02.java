package test;

public class Ex02 {
	
//	2. 1+(1+2)+(1+2+3)+(1+2+3+4) ...(1+2+3+4+5+6+7+8+9+10)의 결과를 계산하시오

	public static void main(String[] args) {
		
		int sum = 0;
		int a = 0;
		
		
		for(int i = 1; i<=10 ; i++) {
			a = a+i;
			sum = sum +a;

		}
		
		System.out.println(sum);
		
		
	}

}

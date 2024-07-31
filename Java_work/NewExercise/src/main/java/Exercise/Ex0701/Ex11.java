package Exercise.Ex0701;

public class Ex11 {

	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		
		boolean 결과값;
		
		결과값 = 3 <= num1 && num1 <=100;
		System.out.println(결과값);
		
		결과값 = num1%3==0;		
		System.out.println(결과값);
		
		결과값 = num1%2==0;		
		System.out.println(결과값);
		
		결과값 = ((num1%3==0) && (num1%2==0)) || num2%2 == 0;
		System.out.println(결과값);
		
		
		

	}

}

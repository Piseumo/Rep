package ex06;

public class Ex05 {
	
	//보냈는 구구단 호출 매서드 2,3
	public static void aa(int dan) {
		System.out.println("aa");
		for(int i = 1; i <10 ; i++)
			System.out.println(dan*i);
	}
	
	// 두수를 받아서 최소 공배수를 출력하는 매서드
	public static void bb(int num1, int num2) {
		System.out.println("bb");
//        int num = 0;
//        while(num<50) {
//        	num++;
//        	if(num%num1==0 && num%num2==0) {
//        System.out.println("최소공배수는 = " +num);
//        break;
//        }
//       }
        for(int num = 0; num < 50 ; num++) {
        	if(num%num1==0 && num%num2==0) {
        		System.out.println("최소공배수는 = " +num);
        	}
        }
//		if( (num1 * num2)/(num1)% == 0 $$ (num1 * num2)/(num2)% == 0));
			

	}
	

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		aa(5);
		bb(3,5);
		System.out.println("프로그램 끝");
	}

}

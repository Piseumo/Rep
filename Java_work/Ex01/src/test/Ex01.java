package test;

public class Ex01 {
	public static void main(String[] args) {

//	1. 1부터 20까지의 정수 중에서 2또는 3의배수가 아닌 수의 총합을 구하시오   i의 값들을 모두 sum으로 더해야된다 
//	2. 1+(1+2)+(1+2+3)+(1+2+3+4) ...(1+2+3+4+5+6+7+8+9+10)의 결과를 계산하시오
//	3. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을때 몇까지 더해야 총합이 100이상이 되는지 구하시오
//	4. for 문을 while 문으로 변경하시오
//	다 한 사람을 함수호출로 변경해 보세요

		int sum = 0;

		// sum 에다가 i값들을 더해서 sum 에다가 넣어라

		for (int i = 1; i <= 20; i++) {
//			System.out.println(sum);
		if (i % 2 != 0 && i % 3 != 0) {
			sum += i;
			sum = sum + i;
			System.out.println(i);
			}
		}
		
		System.out.println(sum);

	}
}

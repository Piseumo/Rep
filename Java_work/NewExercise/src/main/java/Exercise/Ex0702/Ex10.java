package Exercise.Ex0702;

public class Ex10 {
	
// 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 456이면 400이되고 111이라면 100이된다 (1)의 값에 맞는 코드는 넣으시오.
	public static void main(String[] args) {
		int num = 456;
		System.out.println((int)Math.floor((num/100))*100);
		System.out.println(((int)(num/100))*100);
		

	}

}

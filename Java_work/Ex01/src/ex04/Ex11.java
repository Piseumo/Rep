package ex04;

public class Ex11 {

	
	//아래는 화씨(F)를 섭씨(C)로 변환하는 코드이다. 변환 공식이 'C = (F-32)/1.8' 이라고 할때 (1)에 알맞읔ㅡㄴ 코드를 넣으시오
	// 단, 변환 결과값은 소숫점 셋재짜리에서 버림해야한다(형변환이용)
	public static void main(String[] args) {
		int F = 100;
      //float C = (float) Math.floor(((F-32)/1.8)*100)/100;
		float C = ((float)(int)((float)((F-32)/1.8)*100))/100 ;		
		System.out.println(" F = " + F);
		System.out.println(" C = " + C);

	}

}

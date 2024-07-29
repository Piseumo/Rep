package aa;

public class Ex07 {

	public static void main(String[] args) {

		final int max_size = 100;
		System.out.println(max_size);

		double a = 200;
		System.out.println(a);
		a = 300;
		System.out.println(a);

		final String c = "변경불가";

		System.out.println(c);

//		float result = 3.3 + 4.5;
		float result = (float) (3.3 + 4.5);
		System.out.println(result);
		double Result = 3.3 + 5.5;
		System.out.println(Result);
		System.out.printf("정수는 %d 실수는 %f\n", 10, 20.33);
		System.out.println(213212312387878787L);
		System.out.println(3.4*10000000);// 3.4E7 = 3.4의 10의 7승
	}

}

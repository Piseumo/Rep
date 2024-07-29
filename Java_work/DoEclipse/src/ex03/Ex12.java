package ex03;

public class Ex12 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 5;
		int d = 10;

		boolean result = ((a += 10) < 0) && ((b += 10) > 0);
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		
		if ((a += 10) < 0) {
			System.out.println(a+a);
		} else {
			System.out.println(a);
		}

		result = ((c += 10) < 20) || ((d += 10) > 0);
		System.out.println(result);
		System.out.println(c); // 15
		System.out.println(d); // 10

	}

}

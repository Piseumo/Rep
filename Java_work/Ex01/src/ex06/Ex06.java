package ex06;

public class Ex06 {

	public static int aa() {
		System.out.println("bb");
		return 10;
	
	}
	public static void main(String[] args) {
		aa();
		int c = aa();
		System.out.println(c);
	}

}

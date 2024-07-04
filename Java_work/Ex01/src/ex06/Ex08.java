package ex06;

public class Ex08 {

	public static void main(String[] args) {
		
		String result = do8("안녕하세요");
		String temp = do8("안녕하세요");
		System.out.println(temp);
		
		System.out.println(doA(3));
		System.out.println(do8("안녕하세요"));
		
	}
		public static int doA(int num) {
		return num*num;
	}
		public static String do8(String str) {
		return str + str;
		}

}

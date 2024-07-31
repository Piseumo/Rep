package Ex0711;

public class Ex04 {
    public static void main(String[] args) {
        String str = "안녕하세요1반갑습니다 and 저는 바보";
        String[] tempstr = str.split("1");

        for (int i = 0; i< tempstr.length; i++) {
            System.out.println(tempstr[i]);
        }



        String a = "abcdefg";
        System.out.println(a.length());

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));

        System.out.println(a.substring(2));
        System.out.println(a.substring(2,6));//
        System.out.println(a.toUpperCase());


        int[] b = new int[5];
        System.out.println(b.length);
    }
}

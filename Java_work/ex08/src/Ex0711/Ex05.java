package Ex0711;

public class Ex05 {
    public static void main(String[] args) {
       // String -> char[]
       // char[] -> String

        String str = "우리는 할 수 있다.";
        char[] chars = str.toCharArray();

            System.out.println(chars[0]);
            System.out.println(chars[1]);
            System.out.println(chars[2]);
            System.out.println(chars[3]);
            System.out.println(chars[4]);
            System.out.println(chars[5]);
            System.out.println(chars[6]);

            chars[4] = 'A';
            System.out.println(chars[4]);

            String aa = new String(chars);
            System.out.println(aa);




    }
}

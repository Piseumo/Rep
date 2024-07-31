package Ex0717;

public class Ex02 {
    public static void main(String[] args) {
        String str1 = "String";
        String str2 = "new String";

//        System.out.println(str1);
//        System.out.println(str1.length());
//        System.out.println();
//
//        System.out.println(str2);
//        System.out.println(str2.length());
//        System.out.println();

        sho(str1);
        sho(str2);
        sho("Funny String");

    }

    public static void sho(String str){
        System.out.println(str);
        System.out.println(str.length());
        System.out.println();
    }


}

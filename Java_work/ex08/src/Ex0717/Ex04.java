package Ex0717;

import java.util.SortedMap;

public class Ex04 {
    public static void main(String[] args) {
        String a = "asd";
        String b = "asd";

        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println();

        System.out.println(a.compareTo("asd"));
        System.out.println(a.compareTo("ASD"));
        System.out.println(a.compareTo("qweqw"));

        System.out.println();

        System.out.println(a.compareToIgnoreCase("ASD"));
        System.out.println(a.compareToIgnoreCase("qweqw"));
    }
}

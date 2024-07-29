package Exercise.src.Example.Ex0725;

public class Main {
    public static void main(String[] args) {
        A a1 = new A("aa");
        A a2 = new A("aa");
        A a3 = new A("aaaa");

        a1.printThis(a2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a1));
        System.out.println(a3.equals(a1));
        System.out.println(a1==a2);

    }

}

package Ex0711;

public class Ex02 {
    public static void main(String[] args) {
        int a[] = new int[10];//{ , , , , , , , , , }??
        int b[] = {1,2,3,4};
        int c[] = a;

        System.out.println("a.length = " +a.length);


        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[3]);
        System.out.println(a[3]);
      //System.out.println(a[10]);

        a[0] = 20;
        System.out.println(a[0]);

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);

    }
}

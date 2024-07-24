package Q.Q0711;

import java.util.Scanner;

public class Q1 {


    static void hol(int[] num) {
        for (int i = 0; i < num.length; i++)
            if (num[i]%2 != 0) {
                System.out.println(num[i]);
            }
    }
    static void zzak(int[] num){
        for (int i = 0; i < num.length; i++)
            if (num[i]%2 == 0) {
                System.out.println(num[i]);
            }
    }
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        hol(a);
        zzak(a);
    }

}
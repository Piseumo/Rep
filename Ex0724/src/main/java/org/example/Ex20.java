package org.example;

public class Ex20 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Success");
    }
}

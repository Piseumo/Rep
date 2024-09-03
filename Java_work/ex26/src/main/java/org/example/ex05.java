package org.example;

import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        showAll("TEST");
        showAll("TEST","AAA");
        showAll("TEST","AAA","BBB");
    }
    public static void showAll(String ...args){

        System.out.println(Arrays.toString(args));
        System.out.println(Arrays.toString(args));
    }

}

package org.example.Exercise.Ex0722;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {

        int u = 0;
        int c = 0;
        UniFriend uniFriend[] = new UniFriend[10];
        ComFriend comFriend[] = new ComFriend[10];

        uniFriend[0] = new UniFriend("홍길동","01093456755","ㅎㅎ");

        System.out.println(Arrays.toString(uniFriend));
        System.out.println(Arrays.toString(comFriend));

        for (int i = 0; i < u; i++) {
            uniFriend[i].showInfo();

        }
        for (int i = 0; i < c; i++) {
            comFriend[i].showInfo();

        }

    }
}

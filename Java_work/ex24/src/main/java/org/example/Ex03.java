package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("TOY","BOX","ROBOT");
        list = new ArrayList<>(list);
        list.add("이제 이거 된다");
        System.out.println(list);
    }
}

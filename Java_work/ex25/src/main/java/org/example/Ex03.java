package org.example;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        };
        TreeSet<Person> treeSet = new TreeSet<>(comparator);

        treeSet.add(new Person(10,"홍길동"));
        treeSet.add(new Person(2,"김길동"));
        treeSet.add(new Person(233,"정길동"));

        System.out.println(treeSet);
    }
}
package org.example;

import java.util.Set;
import java.util.TreeSet;

public class Ex02 {
    public static void main(String[] args) {


    Set<String> set = new TreeSet<>();

    set.add("탁");
    set.add("나");
    set.add("김");
    set.add("다");

    Set<Member> set1 = new TreeSet<>();
    Member member1 = new Member();
    member1.setName("홍길동");
    member1.setAge(20);
    Member member2 = new Member();
    member2.setName("김길동");
    member2.setAge(30);
    Member member3 = new Member();
    member2.setName("이길동");
    member2.setAge(25);

    set1.add(member1);
    set1.add(member2);
    set1.add(member3);

        System.out.println(set1);
    }
}
package org.example.Exercise.Ex0718;

public class Q11 {

    Q11(){
       Student1 student1 = new Student1("홍길동",90,80,60);
        System.out.println(student1);
        float result = student1.getAverage();
        System.out.println(result);
        System.out.println(student1.getTotal());
    }

    public static void main(String[] args) {
        new Q11();
    }


}

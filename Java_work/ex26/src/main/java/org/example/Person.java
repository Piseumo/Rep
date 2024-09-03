package org.example;

enum Person {
    MAN(1),WOMAN(2);

    private int num;

    Person(int num) {
        this.num = num;
        System.out.println("이거호출되나");
    }
}

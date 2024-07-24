package org.example.Exercise.Ex0722;

public class Friend {
    String name;
    String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    protected void showInfo() {
        System.out.println("이름 = " + name);
        System.out.println("연락처 = " + phone);
    }
}

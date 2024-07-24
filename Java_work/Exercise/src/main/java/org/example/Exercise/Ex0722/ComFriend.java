package org.example.Exercise.Ex0722;

public class ComFriend {
    private String name;
    private String phone;
    private String department;

    public ComFriend(String name, String phone, String department) {
        this.name = name;
        this.phone = phone;
        this.department = department;
    }
        public void showInfo(){
            System.out.println("이름 = " + name);
            System.out.println("연락처 = " + phone);
            System.out.println("부서 = " + department);

    }
}

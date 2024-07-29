package org.example.Exercise.Ex0722;

public class UniFriend extends Friend{
    private String major;

    public UniFriend(String name, String phone, String major) {
        super(name,phone);
        this.major = major;
    }
        public void showInfo(){
            super.showInfo();
            System.out.println("전공 = " + major);

    }
}

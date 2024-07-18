package org.example.Exercise.Ex0718;

public class BizMan extends Man{

    private String company;
    private String position;

    public BizMan(String name, String company,String position){
        super(name);
        //super();
        this.company = company;
        this.position = position;
    }
    public void showInfo(){
        System.out.println("company" + company);
        System.out.println("position" + position);

        tellInfo();

    }
}

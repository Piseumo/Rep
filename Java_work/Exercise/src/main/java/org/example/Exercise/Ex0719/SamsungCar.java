package org.example.Exercise.Ex0719;

//import lombok.ToString;
//
//@ToString
public class SamsungCar extends Car{
    public SamsungCar(String name,String decs,String company) {
        super.name = name;
        super.decs = decs;
        super.company = company;
    }

    public void show(){
        System.out.println(name+""+decs+""+company);
    }

    @Override
    public String toString() {
        return "SamsungCar{" +
                "name='" + name + '\'' +
                ", decs='" + decs + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}


package org.example.Exercise.Ex0719;

//import lombok.ToString;
//
//@ToString
public class KiaCar extends Car{
    public KiaCar(String name,String decs,String company) {
        super.name = name;
        super.decs = decs;
        super.company = company;
    }

    public void show(){
        System.out.println(name+""+decs+""+company);
    }

    @Override
    public String toString() {
        return "KiaCar{" +
                "name='" + name + '\'' +
                ", decs='" + decs + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}


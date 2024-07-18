package org.example.Exercise.Ex0718;
//기본 생성자는 다른생성자를 선언하게 되면 생략불가
//상속 관계에서는 부모클래스 생성자는 무조건적으로 호출되어져야 한다. 기본생성자는 다른생성자든
//상속관계에서는 기본생성자를 호출하는게 잇는데 < 이거 생량되어져 있습니다
//만약에 부모클래스에 기본생성자가 선어되어있지 않을때에는 다른 생성자 호출을 통해 부모 호출 할 수있다
public class Man {

    private String name;

  //  public Man(){
    //}

    public Man(String name){
        this.name = name;
    }
    public void tellInfo(){
        System.out.println("name = "+name);
    }
}

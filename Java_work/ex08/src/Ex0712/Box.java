package Ex0712;

public class Box {
    String name;
    String namea;
    int count;
    //기본 생성자는 생략가능 하지만
    //다른 생성자를 선언할시 기본생성자 생략 불가
    public Box(){
        System.out.println("기본생성자 호출");
    }
    public Box(String n){
        name = n;
        System.out.println("다른생성자 호출");
    }
    public Box(String a,String n){
        namea = a;
        name = n;
        System.out.println("다른생성자 호출");
    }
    public Box(String n,int c){
        name = n;
        count = c;
        System.out.println("n,c 다른생성자 호출");
    }
    // 생략..
    //개발자가 프로그래머가 직접 적게되면 내용이 바뀐다.
    public String toString(){
        return " Box name = " + name +"count= "+count+"namaa="+namea;
    }

    public void doA(){}
    public void doA(String a){}
}

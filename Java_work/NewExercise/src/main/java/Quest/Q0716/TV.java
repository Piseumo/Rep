package Q.Q0716;

public class TV {

    private String name;
    private int year;
    private int inch;

    public TV(String name, int year, int inch) {
        this.name = name;
        this.year = year;
        this.inch = inch;
    }

    public void show() {
        System.out.println("인제 2주 배우셨어요 지금부터 열심히 공부해도 다 할 수있어요");
        System.out.println(name+ "에서 만든"+ year+ "년" +inch+"인치 TV ");
    }


//    public viod show(){}

    //    public TV(String n,int y, int in){
//        name = n;
//        year = y;
//        inch = in;
    }

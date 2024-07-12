package Ex0711;

class Box{
    String conts;

    public Box(String conts) {
        this.conts = conts;
    }

    public String toString(){
        return  "Box{" +
                "conts='"+ conts + '\'' +
                '}';
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Box[] boxs = new Box[5];
        boxs[0] = new Box("사과");

        for (int i = 0 ; i < boxs.length ; i++)
            System.out.println(boxs[i]);

    }
}

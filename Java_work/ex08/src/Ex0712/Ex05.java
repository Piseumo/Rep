package Ex0712;

public class Ex05 {
Ex05(){
    int ar[] = {10,20,30,40,50};
    doA(ar);
    int br[] = makeary(10);
    System.out.println("br.length =" + br.length);
}
public void doA(int[] qw){
    int sum = 0;
    for(int i =0; i< qw.length ; i++){
        sum = sum +qw[i];
    }
    System.out.println(sum);
}
public int[] makeary(int len){
    return new int[len];
}
    public static void main(String[] args) {
        new Ex05();
    }
}

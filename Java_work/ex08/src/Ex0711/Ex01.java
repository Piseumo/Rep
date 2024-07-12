package Ex0711;

import java.util.Scanner;

class Fact{
 public int fact(int num) {
    System.out.println("여기오나"+num);
    //매서드는 반환값을 적게 되면 반환값이 무조건 있어야 한다.
        if(num>0) {
            return 2 * fact(num - 1);
        }
        else{
            return 1;
        }
    }
}
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 승 구할래?");

        String a = scanner.nextLine();
        int num = Integer.parseInt(a);

//        System.out.println(a);
//        System.out.println(num);

        Fact fact = new Fact();
        fact.fact(num);


    }
}
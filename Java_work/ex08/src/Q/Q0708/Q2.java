package Q;

//2. 프로그램 사용자로부터 초(second)를 입력받은 후에,
//이를 [시, 분, 초]의 형태로 출력하는 프로그램을 작성해 보자.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner Second = new Scanner(System.in);
        System.out.println("계산하고 싶은 초를 입력하시오");
        int a = Second.nextInt();
        //60초 = 1분
        //60분 = 1시간
        if(a < 60)
            System.out.println(a + "초");
        else if (a>60 && a<3600)
            System.out.println((a / 60) + "분" + (a % 60) + "초");
        else
            System.out.println((a / 3600) + "시" + 3600%(a / 60) + "분" + (a % 60) + "초");

    }

}

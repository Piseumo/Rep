package Q.Q0712;

import java.util.Scanner;

//프로그램 사용자로부터 10진수 형태로 정수를 하나 입력받은 다음, 이를 2진수로 변환해서 출력하는 프로그램을 작성해 보자.
public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int a = scan.nextInt();
        for (int i = 1 ; i<10 ; i++){
            int result = a/2*2*i;
            //나누기 해서 곱하기 2를 했을때 원래수가 되면 0
            //아니면 1
            if(result*2 == a) {
                   System.out.println("0");
            }
                else if (result*2 != a)
                    System.out.println("1");
            System.out.println(a);


                }
          }


}


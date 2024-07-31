package Q.Q0710;

import java.util.Scanner;

//3. 구구단의 일부분을 다음과 같이 출력하시오
//    2*1=2       3*1=3       4*1=4
//    2*2=4       3*2=6       4*2=8
//    2*3=6       3*3=9       4*3=12
//
//    5*1=5       6*1=6       7*1=7
//    5*2=10      6*2=12      7*2=14
//    5*3=15      6*3=18      7*3=21
//
//    8*1=8       9*1=9
//    8*2=16      9*2=18
//    8*3=24      9*3=27
public class Q2 {
    public static void main(String[] args) {
        int result = 0;
        for(int k = 0 ; k < 7 ; k = k +3 ) {
            for (int i = 1; i < 4; i++) {
                for (int j = 2; j < 5; j++) {
                    result = (j+k) * i;
                    if (j+k ==10){
                        break;
                    }
                    System.out.print((j+k) + "*" + i + "=" + result + "\t");
                }
                System.out.println();
            }
            System.out.println();

       }
    }
}

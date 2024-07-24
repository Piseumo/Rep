package org.example.Q.Q0718;

import java.util.Arrays;

//3. 다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자
//        1   2    3   // 1행은 2행으로 // 0
//        4   5    6   // 2행은 3행으로 // 1
//        7   8    9   // 3행을 1행으로 // 2

// 0 2 =>
/*
7 8 9
4 5 6
1 2 3
*/
// 1 2 =>
/*
7 8 9
1 2 3
4 5 6
*/
//이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경시키는 메소드를 정의하자
//        7   8    9   //1행  2
//        1   2    3   //2행  0
//        4   5    6   //3행  1
//
//물론 배열의 가로와 세로길이에 상관없이 위와 같이 동작하도록 메소드를 정의해야 한다.
// */
public class Q3 {
    public static void main(String[] args) {
            int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int[] temp0 = arr[0];
        int[] temp1 = arr[1];
        int[] temp2 = arr[2];

        arr[0] = temp2;
        arr[1] = temp0;
        arr[2] = temp1;

//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));
    }
}

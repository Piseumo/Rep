package org.example.Q.Q0718;

import org.example.Exercise.Ex0718.Student1;

//1. int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최댓값,최솟값을 찾아서 반환하는 메소드를
//각각 다음의 형태로 정의하자
//public static int minValue(int[] arr){}
//public static int maxValue(int[] arr){}
//
//단 반복문을 사용할때 minz Value의 정의에서는 일반적인 for문을 사용하고
// maxValue의 정의에서는
//새로운 for(enhanced for문)을 사용하기로 하자
public class Q1 {
    public static void main(String[] args) {
        int[] result = {0,100,-1,2,-50};
        maxValue(result);
        minValue(result);
    }
    public static int maxValue(int[] arr) {
        int maxnum = arr[0];
        for (int i : arr){
            if (maxnum < i){
                    maxnum = i;
                }
        }
        System.out.println(maxnum);
        return maxnum;
        }
    public static int minValue(int[] arr) {
        int minnum = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (minnum > arr[i]){
                minnum = arr[i];
            }
        }
        System.out.println(minnum);
        return minnum;
    }


}


package org.example.Q.Q0718;
//2. 다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.
//public static void addOneDArr(int[] arr, int add){
//    for(int i =0; i<arr.length; i++){
//        arr[i] += add;
//    }
//}
//위 메소드를 호출하는 형태로, int형 2차원 배열에 저장된 값 /전부를 두번째 매개변수로 전달된 값의 크기만큼
//증가시키는 메소드를 다음의 형태로 정의하자
//public static void addTwoDArr(int[][] arr, int add){
//    // 이안에 addOneDArr 메소드를 호출한다.
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] arr2 = new int[][]{{1,2,3},{4,5,6}};
        int add = 5;
        addTwoDArr(arr2,add);
        System.out.println();
        addOneDArr(arr,add);


    }
    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
            System.out.print(arr[i]+",");

        }
    }
    public static void addTwoDArr(int[][] arr2, int add){
        for(int i = 0 ; i < arr2.length ;i++ ) {
            //2차원 배열 전체 숫자
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] += add;
                System.out.print(arr2[i][j]+",");
            }
        }
    }
}
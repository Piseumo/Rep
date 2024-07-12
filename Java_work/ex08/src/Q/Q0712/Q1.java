package Q.Q0712;

   //배열 [10,20,30,40,50] 알맞은 코드를 넣어 총합과 평균을 구하세요

public class Q1 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int sum = 0;
        for (int i = 0; i<a.length ; i++){
            sum = sum +a[i];
        }
        System.out.println("sum="+sum);
        System.out.println("avg="+sum/a.length);
    }
}

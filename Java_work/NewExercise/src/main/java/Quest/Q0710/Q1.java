package Q.Q0710;

public class Q1 {
    // 피보나치 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다
    // 예를 들어 앞의 두 수가 1과 1이라면 그 다음수는 2가 되고 그 다음수는 1과
    //
    //i  1  1  2      3            5                    8                          13 21
    //j   0   1    1        2             3         5                                       8+13
    //   i (i+j) i+(i+j)  ((i+j)+(i+(i+j)) ((i+j)+(i+(i+j)) + (i+(i+j))
    // int a = a + b(그전에 나왔던 수)
    // 0 1 1 2 3 5 8 13 ...

    public static void main(String[] args) {
//        int i = 1;
//        int j = 0;
//        for( ; i < 50 && j < 50 ; ){
//                i = i +j;
//                j = i +j;
//                int sum = i+j;
//                System.out.println("i = "+i);
//                System.out.println("j = "+j);
//        }
        int i = 0;
        int j = 1;
        int sum = 0;
        for (int k = 2; k <= 10; k++) {
            sum = i + j; // 2
            i   = j;
            // 1
            j   = sum;
            // 1
            System.out.println(i);
        }

    }
}


import java.util.Scanner;

public class Ex15 {

        // 1+2+3+4...10까지 더하는 메서드
        public static void doA(int end){
            int sum1 = 0;
            for(int i = 1 ; i <= end; i ++)
                sum1 += i;
            System.out.println("1부터 "+end+"까지 더한 수 =" + sum1);
        // 1*2*3*4*...10까지 곱하는 매서드
        }
        public static void do8(int end){
            int sum1 = 1;
            for(int i = 1 ; i <= end; i ++)
                sum1 = sum1 * i;
            System.out.println("1부터 "+end+"까지 곱한 수 =" + sum1);
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("몇까지 계산할 까요?");
        int sum1 = 1;
        int test = scan.nextInt();
            doA(test);
            do8(test);

    }
}

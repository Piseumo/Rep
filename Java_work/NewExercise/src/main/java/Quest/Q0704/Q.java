public class Q {
    // 1. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 만드시오
    // 2. Math.random을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하여라.
    // (1)에 알맞은 코들르 쓰시오

    public static void main(String[] args) {

        
            for (int a = 1; a <= 6; a++) {
            //System.out.println("a =" + a);
            for ( int b = 1; b <= 6; b++) {
             // System.out.println("b =" + b);
                int sum = a + b;
                if (sum == 6) {
                    System.out.println("첫번째 주사위는"+a);
                    System.out.println("두번쨰 주사위는"+b);
                }

        //        System.out.println("합"+sum);


//                System.out.println("합" + a+b);
//                System.out.println("b" + b);

            }
        }
    }
}

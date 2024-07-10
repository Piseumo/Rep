package Q.Q0708;

public class Q5 {
    //방정식 의 모든 해를 구하시오 단 x와y는 정수이고 각각의 범위는 2x+4y=10 . , x y
    //0<=x<=10, 0<=y<=10 .
    public static void main(String[] args) {


        for (int result = 1; result<4; result++) {
            for (int x = 0; x >= 0 && x <= 10; x++) {
                for (int y = 0; y >= 0 && y <= 10; y++) {
                    if ((2 * x) + (4 * y) == 10) {
                        System.out.print(result + "번째 정답은"+"\n");
                        System.out.print("x = " + x + "\t");
                        System.out.print("y = " + y);
                        System.out.println();
                        result = result + 1;

                    }
                }
            }

        }
    }


}

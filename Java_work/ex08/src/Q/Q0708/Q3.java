package Q.Q0708;
//3. 필자가 좋아하는 것 중 하나가 금요일 저녁 퇴근길에 DVD나 만화책을 잔뜩 빌리고,
//동네 슈퍼에 들러서 군것질거리를 사 가지고 집에 들어가는 것이다.
//오늘은 금요일이다. 현재 필자의 주머니에는 5천 원이 있다.
//DVD 한 편을 빌리면 3,500원이 남는다.
//슈퍼에 들려서 크림빵(500원), 새우깡(700원), 콜라(400원)를 사려한다.
//잔돈을 하나도 남기지 않고 이 세 가지 물건을 하나 이상 반드시 구매하려면
//어떻게 구매를 진행해야 하겠는가? 물론 여기에는 여러 가지 경우의 수가 있을 것이다.
// 0번씩 1900원

public class Q3 {
    public static void main(String[] args) {



        for(int i = 1; i <7 ; i++){
            for(int j = 1; j < 5; j++){
                for(int k = 1; k < 9; k++){
                  // System.out.println("크림빵 =" + i*500);
                  // System.out.println("새우깡 =" + j*700);
                  // System.out.println("콜라 =" + k*400);
                    if (i*500+j*700+k*400==3500) {
                        System.out.println("크림빵" + i+"개"+i * 500);
                        System.out.println("새우깡" + j+"개" +j * 700);
                        System.out.println("콜라" +k+"개"+k * 400);
                        System.out.println("");
                    }
                }

            }

        }


//        for(int i = 0; i < 5; i++){
//            System.out.print("i = " + i + " ");
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // i j k
//        // 0 0 0
//        // 0 0 1
//        // 0 0 2
//        // 0 0 0 ~ 9
//        // 0 1 0 ~ 9
//        // 0 2 0 ~ 9
//        // 0 0 ~ 9 0 ~ 9
//        // 1 0 ~ 9 0 ~ 9
//        // 0 ~ 9 0 ~ 9 0 ~ 9
//        // 111
//        // 222
//        // 333
//        // 444
////        for (int i = 0; i < 10; i++) {
////            for (int j = 0; j < 10; j++) {
////                for (int k = 0; k < 10; k++) {
////
////                    System.out.println(i + " " + j + " " + k);
////                }
////            }
////        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(i+1);
//            }
//            System.out.println();
//        }




    }
}
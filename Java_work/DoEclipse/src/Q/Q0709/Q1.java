package Q.Q0709;
import java.util.Scanner;
//가위 바위 보 게임을 만들어 보자.
//사용자로부터 가위 바위 보 중에서 하나를 입력 받는다.
//그리고 컴퓨터는 난수 생성을 통해서 가위 바위 보 중에서 하나를 선택하게 한다.
//이 둘을 비교해서 승자와 패자를 가려주는 프로그램을 작성해 보자.
//단 프로그램의 진행은 사용자가 질 때까지 계속되어야 하고,
//마지막에 가서는 게임의 결과(예: 4승 3무)까지 출력해 주도록 하자.
public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("가위,바위,보 중에서 하나를 입력하시오");
        int win = 0;
        int draw = 0;
        while(true) {
            String n = scan.next();
            /*
            if(비겼을때)
            player == computer
            ->한줄로 끝
            else if(이겼을때)

            ->가위 바위 보
            else (졌을때)
            -> 짐
             */
        int a = (int) (Math.random()*10);{
                if (n.equals("가위") && (a >= 1 && a <= 3)) {
                    System.out.println("컴퓨터는 가위를 냈으므로");
                    System.out.println("비겼습니다.");
                    draw += 1;
                } else if (n.equals("가위") && (a >= 3 && a <= 6)) {
                    System.out.println("컴퓨터는 바위를 냈으므로");
                    System.out.println("졌습니다.");
                    break;
                } else if (n.equals("가위") && (a >= 7 && a <= 9)) {
                    System.out.println("컴퓨터는 보를 냈으므로");
                    System.out.println("이겼습니다.");
                    win += 1;
                } else if (n.equals("바위") && (a >= 1 && a <= 3)) {
                    System.out.println("컴퓨터는 가위를 냈으므로");
                    System.out.println("이겼습니다.");
                    win += 1;
                } else if (n.equals("바위") && (a >= 3 && a <= 6)) {
                    System.out.println("컴퓨터는 바위를 냈으므로");
                    System.out.println("비겼습니다.");
                    draw += 1;
                } else if (n.equals("바위") && (a >= 7 && a <= 9)) {
                    System.out.println("컴퓨터는 보를 냈으므로");
                    System.out.println("졌습니다.");
                    break;
                } else if (n.equals("보") && (a >= 1 && a <= 3)) {
                    System.out.println("컴퓨터는 가위를 냈으므로");
                    System.out.println("졌습니다.");
                    break;
                } else if (n.equals("보") && (a >= 3 && a <= 6)) {
                    System.out.println("컴퓨터는 바위를 냈으므로");
                    System.out.println("이겼습니다.");
                    win += 1;
                } else if (n.equals("보") && (a >= 7 && a <= 9)) {
                    System.out.println("컴퓨터는 보를 냈으므로");
                    System.out.println("비겼습니다.");
                    draw += 1;
                }
            }
        }
        System.out.println("게임 결과 = " + win +"승"+ draw +"무"+ "1패");
    }
}

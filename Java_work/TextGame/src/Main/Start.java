//hello world
//

package Main;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("게임을 시작 하겠습니까?(Y/N)");
        String start = scan.nextLine();


        if (start.equals("Y") || start.equals("y")) {
            System.out.println("새게임으로 시작 하겠습니까?(Y/N)");
            String start2 = scan.nextLine();
            if (start.equals("Y") || start.equals("y")) {
                System.out.println("직업을 선택창");
            } else if (start.equals("n") || start.equals("N")) {
                System.out.println("게임이 종료 됩니다.");
            }
        } else if (start.equals("N") || start.equals("n")) ;
        {
            System.out.println("게임이 종료 됩니다");
        }

        else if (start.equals("N") || start.equals("n")) {
            System.out.println("이어 하겠습니까?(Y/N)");
            String start3 = scan.nextLine();

            if (start.equals("Y") || start.equals("y")) {
                System.out.println("기존 사용자 계정명을 입력하세요.");
            } else if (start.equals("N") || start.equals("n")) ;
            {
                System.out.println("게임이 종료 됩니다");
            }
        }
    }
}

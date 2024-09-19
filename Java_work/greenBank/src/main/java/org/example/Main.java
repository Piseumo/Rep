package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
        Scanner scan =  new Scanner(System.in);
        DBRepository dbRepository = new DBRepository();
        public void starter(){
        try {
            System.out.println("할 것을 입력하세요");
            switch (scan.nextInt()){
                case 1 :
                    dbRepository.insert();
                    break;
                case 2 :
                    dbRepository.select();
                    break;
                case 3 :
                    dbRepository.update();
                    break;
                case 4 :
                    dbRepository.delete();
                    break;
                case 5 :
                    System.out.println("종료합니다");
                    return;
            }

        }catch (InputMismatchException e){
            System.out.println("숫자만 입력 하세요 \n 처음부터 다시 시작합니다");
            scan.nextLine();
            starter();

         }
        }


public static void main(String[] args) {
    Main main = new Main();
    main.starter();
    }
}


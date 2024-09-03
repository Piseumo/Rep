package org.example;

import java.util.Scanner;

public class Starter {
    private MemberRepository memberRepository
            = new MemberRepository();
        Starter(){
            Scanner scan =  new Scanner(System.in);
            while (true){
                System.out.println("""
                    뭐할래?
                    1.select
                    2.insert
                    3.update
                    4.delete
                    """);
                int ra = scan.nextInt();

                if(ra == 1){
                    memberRepository.select();
                } else if (ra == 2) {
                    memberRepository.insert();
                }
            else{
                System.out.println("종료됩니다.");
                break;
            }
          }
        }

    public static void main(String[] args) {
        new Starter();
    }
}

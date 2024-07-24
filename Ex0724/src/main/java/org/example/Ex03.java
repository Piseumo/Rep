package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex03 {
    
    public static void md1() throws IOException {


            Path file = Paths.get("d://simple.txt");
            BufferedWriter writer = null;
            //IDE Exeption 이 발생하기 떄문에 try catch문써라
        try {    writer = Files.newBufferedWriter(file);
            writer.write('A');
            writer.write("문자열로 적어봅니다");
        }catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//            if (writer != null) ;
//            writer.close();
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
    }
    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            System.out.println("파일만들기실패");
            e.printStackTrace();
        }
    }
}

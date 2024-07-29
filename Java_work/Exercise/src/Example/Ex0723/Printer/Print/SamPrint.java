package org.example.Exercise.Ex0723.Printer.Print;

import org.example.Exercise.Ex0723.Printer.Inter.Printable;

public class SamPrint implements Printable {
    @Override
    public void print(String mydoc){
        System.out.println("삼성프린터 출력");
        System.out.println(mydoc);

    }
}

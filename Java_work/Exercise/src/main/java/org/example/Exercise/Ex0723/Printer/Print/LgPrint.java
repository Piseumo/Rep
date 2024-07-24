package org.example.Exercise.Ex0723.Printer.Print;

import org.example.Exercise.Ex0723.Printer.Inter.Printable;

public class LgPrint implements Printable {
    @Override
    public void print(String mydoc) {
        System.out.println("LG프린터 출력");
        System.out.println(mydoc);
    }
}



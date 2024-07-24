package org.example.Exercise.Ex0723.Printer;

import org.example.Exercise.Ex0723.Printer.Inter.Printable;

public class Ex02 {
    public static void main(String[] args) {

        Printable prn = new Printable() {
            @Override
            public void print(String mydoc) {
                System.out.println("test"+mydoc);

            }
        };
        prn.print("새로운 문서 출력");

    }
}

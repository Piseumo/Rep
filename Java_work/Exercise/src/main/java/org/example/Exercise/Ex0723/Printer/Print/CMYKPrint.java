package org.example.Exercise.Ex0723.Printer.Print;

import org.example.Exercise.Ex0723.Printer.Inter.CMYKPrintable;

public class CMYKPrint implements CMYKPrintable {

    @Override
    public void printCMYK(String doc) {
        System.out.println("컬러프린트기");
        System.out.println(doc);
    }

    @Override
    public void print(String mydoc) {
        System.out.println("흑백 프린터기");
        System.out.println(mydoc);

    }
}

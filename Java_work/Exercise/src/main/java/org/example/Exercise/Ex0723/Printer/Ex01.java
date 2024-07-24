package org.example.Exercise.Ex0723.Printer;

import org.example.Exercise.Ex0723.Printer.Inter.CMYKPrintable;
import org.example.Exercise.Ex0723.Printer.Inter.Printable;
import org.example.Exercise.Ex0723.Printer.Print.CMYKPrint;

public class Ex01 {
    public static void main(String[] args) {
        //2개의 변수와 2개의 매서드
        System.out.println(Printable.WIDTH);
        System.out.println(CMYKPrintable.HEIGHT);
        
        CMYKPrintable prn = new CMYKPrint();

        prn.print("옛날 프린터기");
        prn.printCMYK("내문서");

        prn.clean();

        Printable.printLine();
    }
}

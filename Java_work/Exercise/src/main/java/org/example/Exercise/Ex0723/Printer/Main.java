package org.example.Exercise.Ex0723.Printer;

import org.example.Exercise.Ex0723.Printer.Inter.CMYKPrintable;
import org.example.Exercise.Ex0723.Printer.Inter.Printable;
import org.example.Exercise.Ex0723.Printer.Print.CMYKPrint;
import org.example.Exercise.Ex0723.Printer.Print.LgPrint;
import org.example.Exercise.Ex0723.Printer.Print.SamPrint;

public class Main {
    public static void main(String[] args) {
        System.out.println(Printable.HEIGHT);
        System.out.println(Printable.WIDTH);

        Printable.printLine();
        Printable prn = new LgPrint();

        prn.print("내문서");

        prn = new SamPrint();
        prn.print("내문서");

        CMYKPrintable cmykPrintable = new CMYKPrint();

    }

}

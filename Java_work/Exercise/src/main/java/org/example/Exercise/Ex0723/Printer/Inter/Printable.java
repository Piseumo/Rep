package org.example.Exercise.Ex0723.Printer.Inter;

public interface Printable {

    public static final int HEIGHT = 90;
    int WIDTH = 120;
    
    void print(String mydoc);

    default void clean() {
        System.out.println("청소기능추가");
    }
        static void printLine(){
            System.out.println("한줄일떄 줄바꿈...");

    }
}

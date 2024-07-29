package org.example;

class Board{
}
class Pboard extends Board{
}
public class Ex02 {
     //Exception in thread "main" java.lang.ClassCastException: class org.example.Board cannot be cast to class org.example.Pboard (org.example.Board and org.example.Pboard are in unnamed module of loader 'app')
    //	at org.example.Ex02.main(Ex02.java:13)
    public static void main(String[] args) {
        Board board = new Pboard();
        //Pboard pboard = (Pboard) new Board();
        System.out.println("안녕하세요");
    }
}

package org.example;

interface Printable {
    void print();
}
class Print1 implements  Printable{
    @Override
    public void print(){
        System.out.println("dd");
    }
}
public class Printer{
    public static void main(String[] args) {

    Printable print = new Printable() {
        @Override
        public void print() {
            System.out.println("익명 인터페이스");
        }
    };


    }
}

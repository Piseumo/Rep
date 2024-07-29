package org.example.Exercise.Ex0722;

public class BankAccount00 {
    public static void main(String[] args) {
        BankAccount tak = new BankAccount();
        BankAccount kang = new BankAccount();

        tak.deposit(10000000);
        kang.deposit(10000);

        tak.withdraw(50000);
        kang.withdraw(50000);

        tak.checkMyBalance();
    }

}

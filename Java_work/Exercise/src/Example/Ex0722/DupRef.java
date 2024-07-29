package org.example.Exercise.Ex0722;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ref1 = new BankAccount();
        BankAccount ref2 = ref1;

        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.deposit(400);
        ref2.deposit(300);
        ref1.checkMyBalance();
        ref2.checkMyBalance();

    }
}

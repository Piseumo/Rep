package Bank;

public class BankAccountMain {
    public static void main(String[] args) {
        System.out.println("시작");

        BankAccount park = new BankAccount();
        BankAccount yoon = new BankAccount();

        park.cmb();
        yoon.cmb();

        park.deposit(3000); // = num + (a)
        park.deposit(3000);
        yoon.deposit(10000);

        park.cmb();
        yoon.cmb();

        park.withdraw(10000);
        yoon.withdraw(1000);

        park.cmb();
        yoon.cmb();


        System.out.println("끝");
    }
}

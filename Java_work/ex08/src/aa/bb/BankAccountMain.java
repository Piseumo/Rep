package aa.bb;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
        // 클래스 변수 출력할떄..
        // toString은 생략가능하다.
        // 원래는 주소값이 나오는데
        // toString은 내가 다시 정의 할 수있다.
        System.out.println("a참조변수 " +a);
        System.out.println("b참조변수 " +b);

        a.mod();

        System.out.println("a참조변수 " +a);
        System.out.println("b참조변수 " +b);
    }
}

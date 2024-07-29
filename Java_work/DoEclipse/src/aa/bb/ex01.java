package aa.bb;
public class ex01 {

public static int fact(int num) {
    if (num > 0) {
        return num * fact(num - 1);
        // 5 * 4(fact)
    } else {
        return 1;
    }
}


    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
//        String[] strary = {"aa","bb","cc"};
//        System.out.println("배열선언함");
//                main(strary);
    }

}

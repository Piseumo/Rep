public class Ex17 {
    public static void main(String[] args) {
        // 2. Math.random을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하여라.
            int value = 0;
        for (int i = 0; value < 6 ; i++){
        double a = Math.random()*100;
        if (a<6)
        System.out.println(a);
        }
    }
}

package Ex0715;

public class Ex03 {
    public static void main(String[] args) {

        //2차원 배열 값 초기화
        int[][] num = {{11}, {11, 22}, {11, 22, 33}};

        System.out.println("num.length = " + num.length);
        System.out.println("num[0].length = " + num[0].length);
        System.out.println("num[1].length = " + num[1].length);
        System.out.println("num[2].length = " + num[2].length);

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
        //13강 배열 끝
    }
}


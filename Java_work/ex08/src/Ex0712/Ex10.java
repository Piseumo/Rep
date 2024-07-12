package Ex0712;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {

        String str[] = {"aa","bb","cc"};
        for (String b :str){
            System.out.println(b);
        }

        int ar[] = {1,2,3,4};
        System.out.println(Arrays.toString(ar));

        for (int i = 0; i < ar.length ; i++){
            System.out.println(ar[i]);
        }
        System.out.println();

        for (int i : ar){
            System.out.println(i);
        }

    }
}

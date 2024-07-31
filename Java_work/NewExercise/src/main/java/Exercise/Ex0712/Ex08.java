package Ex0712;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4};
        int br[] = new int[10];

        System.arraycopy(ar,3,br,2,5);

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(br));
    }
}

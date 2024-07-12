package Q.W;
// 1 1 2 3 5 8 13 21
public class ww {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        //System.out.println(i);
        //System.out.println(j);
        for(int k= 0 ; k <4; k++){
            sum = i + j ;
            i = sum;
            j = sum+j;
            //System.out.println(i);
           //System.out.println(j);
        }
        System.out.println(j);
    }
}

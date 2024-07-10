package Ex0709;

public class star {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            for(int j = 4-i ; j>=0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package Ex0728;
public class Super{
    public static void main(String[] args) {
    // new SubCLS();
        new SubCLS(1);
        new SubCLS(1,1);

    }
}

 class SuperCLS {
    public SuperCLS(){
        System.out.println("dd1");
    }
    public SuperCLS(int i){
        System.out.println("dd2");
    }
    public SuperCLS(int i,int j){
        System.out.println("dd3");
    }
}
class SubCLS extends SuperCLS{
    public SubCLS(){
        System.out.println("aa1");
    }
    public SubCLS(int i){
        //super(i);
        System.out.println("aa2");
    }
    public SubCLS(int i, int j){
        //super(i,j);
        System.out.println("aa3");
    }
}
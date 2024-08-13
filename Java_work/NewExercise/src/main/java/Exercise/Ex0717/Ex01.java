package Exercise.Ex0717;
//오버로딩은 매서드 생성자 이름이 같지만 파라미터가 다를떄 사용가능하다
public class Ex01 {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("920619");
        Person p3 = new Person("920619","15000");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.how();
        p2.how();
        p3.how();


    }
}

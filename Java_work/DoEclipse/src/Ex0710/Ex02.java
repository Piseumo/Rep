package Ex0710;
class B{
    // to String 생략 개발자 임의적으로 적게되면 적었는 내용 ㅣㄹ핼
    // 생성자도 생략가능
    //생량되어진 문법...
    int a = 10;
    public B(){
        System.out.println("생성자");
        a = 20;
    }
    //public String toString(){ return " aaa "}
}

public class Ex02 {
    public static void main(String[] args) {
        // 생성자는 함수랑 비슷한 모양이지만
        // 변환값을 적지 않는다.
        B b = new B();
        System.out.println(b.a);

    }
}

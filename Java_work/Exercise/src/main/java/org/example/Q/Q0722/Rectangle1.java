package org.example.Q.Q0722;

//        - int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
//    - x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
//    - int square() : 사각형 넓이 리턴
//    - void show() : 사각형의 좌표와 넓이를 화면에 출력
//    - boolean contatins(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
//    - main() 메소드의 코드와 실행 결과는 다음과 같다
class RectangleA{
    int x;
    int y;
    int width;
    int height;

    public RectangleA(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int square(){
        return x*y;

    }

}

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if (t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}

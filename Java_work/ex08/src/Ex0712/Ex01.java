package Ex0712;

public class Ex01 {
    public static void main(String[] args) {
        // 인스턴스화 메모리적재 된다.
        Box abox = new Box("사과");
        Box aabox = new Box("수박","체리");
        Box bbox = new Box();
        Box cbox = new Box("바나나",10);

        System.out.println(abox);
        System.out.println(aabox);
        System.out.println(bbox);
        System.out.println(cbox);
    }

}

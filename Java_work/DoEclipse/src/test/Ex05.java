package test;

class Dog {
	public static int numberOfDogs = 0; // 클래스 변수

	public static void incrementDogs() { // 클래스 메소드
		numberOfDogs++;
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Dog.incrementDogs();
		System.out.println(Dog.numberOfDogs); // 출력: 1
	}

}

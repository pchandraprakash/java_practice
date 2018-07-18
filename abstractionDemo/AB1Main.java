package abstractionDemo;

public class AB1Main {

	public static void main(String[] args) {
		AB2 ab = new AB2();
		System.out.println(ab.addNum(10, 20));
		System.out.println(ab.subNum(10, 40));
		ab.x = 10;
		ab.y = 20;
		System.out.println(ab.x - ab.y);
	}
}

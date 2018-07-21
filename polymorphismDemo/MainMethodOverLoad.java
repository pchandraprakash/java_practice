package polymorphismDemo;

public class MainMethodOverLoad {
	public static void main() {
		System.out.println("without args");
	}

	public static void main(String[] args) {
		System.out.println("with String[] args");
		MainMethodOverLoad m1 = new MainMethodOverLoad();
		m1.main(1);
		m1.main("abc");
		m1.main();

	}

	public static void main(String args) {
		System.out.println("with String args");
	}

	public static void main(int a) {
		System.out.println("with integer arg");
	}
}

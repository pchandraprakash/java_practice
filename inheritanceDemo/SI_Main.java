package inheritanceDemo;

public class SI_Main {

	public static void main(String[] args) {
		SI_B si1 = new SI_B();
		System.out.println("add method from SI_A class: " + si1.addMethod(10, 20));
		System.out.println("sub method from SI_B class: " + si1.subMethod(20, 10));
	}
}
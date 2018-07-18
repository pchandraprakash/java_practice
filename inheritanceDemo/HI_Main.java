package inheritanceDemo;

public class HI_Main {

	public static void main(String[] args) {
		/*
		 * here we should create 2 different instances for class B and class C
		 */

		HI_B hib = new HI_B();
		HI_C hic = new HI_C();

		System.out.println("from HI_B class: " + hib.addNum(10, 20));
		System.out.println("from HI_C class: " + hic.addNum(30, 20));
	}
}

package inheritanceDemo;

public class MI_Main {

	public static void main(String[] args) {
		MI_C mi1 = new MI_C();
		System.out.println("from MI_A class: " + mi1.addNum(10, 20));
		System.out.println("from MI_B class: " + mi1.subNum(10, 20));
		System.out.println("from MI_C class: " + mi1.prodNum(10, 20));
	}
}
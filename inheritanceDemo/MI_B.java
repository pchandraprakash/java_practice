package inheritanceDemo;

public class MI_B extends MI_A {
	MI_B(){
		System.out.println("MI_B Constructor");
	}
	public int subNum(int a, int b) {
		return a-b;
	}
}

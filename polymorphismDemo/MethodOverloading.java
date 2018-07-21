package polymorphismDemo;

public class MethodOverloading {
	
	public double area(int radius) {
		System.out.println("returning the area of circle: ");
		return 3.14 * radius * radius;
	}
	
	public double area(int base, int height) {
		System.out.println("returning the area of triangle: ");
		return 0.5 * base * height;
	}

	public static void main(String[] args) {
		
		MethodOverloading m1 = new MethodOverloading();
		System.out.println(m1.area(10));
		System.out.println(m1.area(10, 20));
	}

}

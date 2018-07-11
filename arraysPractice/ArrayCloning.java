package arraysPractice;

public class ArrayCloning {
	// Problem: How to perform array cloning?
	public static void main(String[] args) {
		// step 1: declare and initialize an array
		int[] a = { 1, 2, 3 };
		int[] a1 = a.clone();
		for (int i = 0; i < a.length; i++) {
			System.out.println("original array elements: " + a[i]);
			System.out.println("cloned array elements: " + a1[i]);
			System.out.println("=================================");
		}
		System.out.println("object id of original array: " + a);
		System.out.println("object id of cloned array: " + a1);
		System.out.println("=================================");
		System.out.println("are they same? " + (a == a1));
	}
}
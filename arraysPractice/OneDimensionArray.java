package arraysPractice;

public class OneDimensionArray {

	public static void main(String[] args) {
		// step1: declare and initialize an array with a size
		int[] a = new int[10];
		// step2: iterate through array elements using for or for-each loop
		for (int i = 0; i < a.length; i++) {
			a[i] = i * 10;
			System.out.println("Element at index " + i + " : " + a[i]);
		}
		// for-each loop
		for (int num : a) {
			System.out.println(num);
		}
	}
}
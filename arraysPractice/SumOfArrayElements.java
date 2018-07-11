package arraysPractice;

public class SumOfArrayElements {
	// Problem: How to calculate the sum of all the elements of an array?
	public static void main(String[] args) {
		// step 1: declare and initialize an array
		int[] a = { 1, 3, 5, 6, 2, 7 };
		// step 2: declare a sum variable and initialize it to zero
		int sum = 0;
		// step 3: iterate all the array elements using for loop and add it to sum every time
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		// step 4: print the sum
		System.out.println("sum of the numbers: " + sum);
	}
}
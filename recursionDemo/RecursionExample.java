package recursionDemo;

public class RecursionExample {

	// Example 1: Summation Example of 3 => 3+2+1 = 6
	public static int summation(int n) {
		// BASE CASE: WE ARE AT THE END
		if (n <= 0) {
			return 0;
		}
		// RECURSIVE CASE: KEEP REPEATING
		// 3 + summation(2)
		// 3 + 2 + summation(1)
		// 3 + 2 + 1 + summation(0)
		// 3 + 2 + 1 + 0 => 6
		else {
			return n + summation(n - 1);
		}
	}

	// Example 2: Factorial Example of 4! => 4 * 3 * 2 * 1 => 24
	public static int factorial(int n) {
		// BASE CASE: WE ARE AT THE END
		if (n <= 1) {
			return 1;
		}
		// RECURSIVE CASE: KEEP REPEATING UNTIL YOU REACH END
		// 4 * factorial(3)
		// 4 * 3 * factorial(2)
		// 4 * 3 * 2 * factorial(1)
		// 4 * 3 * 2 * 1 => 24
		else {
			return n * factorial(n - 1);
		}
	}
	
	// Example 3: Exponents Example of 5^3 => 5 * 5 * 5 => 125
	public static int exponent(int n, int p) {
		//BASE CASE: WE ARE AT THE END
		if(p<=0) {
			return 1;
		}
		//RECURSIVE CASE: REPEATE UNTIL YOU REACH THE END
		// 5 * exponent(5,2)
		// 5 * 5 * exponent(5,1)
		// 5 * 5 * 5 * exponent(5,0)
		// 5 * 5 * 5 * 1 => 125
		else {
			return n * exponent(n, p-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(summation(3));
		System.out.println(factorial(4));
		System.out.println(exponent(5,3));
	}
}
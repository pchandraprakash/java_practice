package stringsPractice;

public class StringComparisionDemo {
	// problem: how to compare 2 string variables?
	public static void main(String[] args) {
		// step 1: declare and initialize more than one string variables
		String s1 = "hello world";
		String s2 = "HELLO WORLD";
		String s3 = "hello world";

		// method 1: using equals method from string class
		boolean res1 = s1.equals(s2);
		System.out.println(res1);

		// method 2: using equals operator
		boolean res2 = s1 == s2;
		System.out.println(res2);

		// method 3: using compareTo method from string class
		int res3 = s1.compareTo(s3);
		System.out.println(res3);
	}

}

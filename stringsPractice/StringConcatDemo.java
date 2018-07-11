package stringsPractice;

public class StringConcatDemo {
	// problem: how to join 2 or more string variables?
	public static void main(String[] args) {
		// step 1: declare and initialize more than one string variables
		String s1 = new String("hello");
		String s2 = " world";

		// method 1: using + arithmetic operator
		String s3 = s1 + s2;
		System.out.println(s3);

		// method 2: using concat method of string class
		String s4 = s1.concat(s2);
		System.out.println(s4);

		// method 3: using append method of stringBuilder or stringBuffer class.
		String s = new StringBuilder().append("Sachin").append(" Tendulkar").toString();
		System.out.println(s);
	}
}
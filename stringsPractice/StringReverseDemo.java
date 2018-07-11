package stringsPractice;

public class StringReverseDemo {

	// Problem: How to reverse a string?

	public static String StringBufferTest(String str) {
		//step 1: create a string buffer object and pass the string to the constructor.
		StringBuffer s1 = new StringBuffer(str);
		//step 2: perform string reverse using reverse method
		s1.reverse();
		//step 3: reverse the string
		return s1.toString();
	}

	public static String StringBuilderTest(String str) {
		
		StringBuilder s1 = new StringBuilder(str);
		s1.reverse();
		return s1.toString();
	}

	public static String StringIterator(String str) {

		char[] c = str.toCharArray();
		String rev = "";
		for (int i = c.length - 1; i >= 0; i--) {
			rev += c[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("using string buffer class: "+StringBufferTest("hello world"));
		System.out.println("using string builder class: "+StringBuilderTest("hello world"));
		System.out.println("using for loop: "+StringIterator("hello world"));
	}
}
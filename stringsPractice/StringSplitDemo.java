package stringsPractice;

public class StringSplitDemo {
	// problem: How to split a string
	public static void main(String[] args) {
		String str = "hello phanindra all the best for your interview";

		// method 1: using split method with regular expression

		// step 1: declare a string array and initialize it by splitting the given
		// string
		String[] s1 = str.split("\\s");
		System.out.println("method 1");
		// step 2: iterate each section of the string array to get the individual words
		for (String words : s1) {
			System.out.println(words);
		}
		System.out.println("===========");
		// method 2: using split method with regular expression and length
		String[] s2 = str.split("\\s", 0);
		System.out.println("method 2");
		for (String words : s2) {
			System.out.println(words);
		}
		System.out.println("===========");

		// method 3: using split method with regular expression and length
		String[] s3 = str.split("\\s", 1);
		System.out.println("method 3");
		for (String words : s3) {
			System.out.println(words);
		}
		System.out.println("===========");

		// method 4: using split method with regular expression and length
		String[] s4 = str.split("\\s", 2);
		System.out.println("method 4");
		for (String words : s4) {
			System.out.println(words);
		}
		System.out.println("===========");
	}

}

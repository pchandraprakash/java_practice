package stringsPractice;

public class StringJoinDemo {
// problem: how to join strings?
	public static void main(String[] args) {
		// step 1: declare and initialize one more string variables
		String s1 = "hello";
		String s2 = "phanindra";
		String s3 = "all the best for the job interview";
		// step 2: using join method to combine all the string with a delimiter
		String s = String.join("-", s1,s2,s3);
		System.out.println(s);
	}
}
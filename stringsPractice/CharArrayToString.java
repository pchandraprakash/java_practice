package stringsPractice;

public class CharArrayToString {

	public static void main(String[] args) {
		/*
		 * problem: How to convert list of characters into a string?
		 */
		// step 1: declare and initialize a character array
		char[] ch = { 'h', 'e', 'l', 'l', 'o' };
		// step 2: create a string object and pass the newly character array as an
		// argument to the string constructor
		String s = new String(ch);
		// step 3: print the string
		System.out.println(s);
	}
}

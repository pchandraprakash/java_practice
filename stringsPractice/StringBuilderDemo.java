package stringsPractice;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// step 1: declare and initialize a string variable
		String s = "you must learn coding by lot of practice";
		// step 2: create a string builder object and pass the string variable as an
		// argument to the string builder constructor
		StringBuilder bs = new StringBuilder(s);
		// step 3: perform string various operations by overriding different string
		// builder methods.
		System.out.println(bs.append(" 123"));
		System.out.println(bs.insert(5, "NEW "));
		System.out.println(bs.replace(4, 10, "replaced"));
		System.out.println(bs.delete(4, 10));
		System.out.println(bs.reverse());
		System.out.println(bs.capacity());
		System.out.println(bs.charAt(15));
		System.out.println(bs.length());
		System.out.println(bs.substring(5));
		System.out.println(bs.substring(3, 15));
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}

}

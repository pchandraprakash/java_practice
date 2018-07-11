package stringsPractice;

public class PerformanceTets {
	// performance test between string buffer and string builder classes.
	public static void main(String[] args) {
		// step 1: declare and initialize 2 string variables; one for base string and
		// one for appending
		String s = "hello";
		String append = " world";
		// step 2: declare and initialize a long time variable (key word SctM)
		long startTime = System.currentTimeMillis();
		// step 3: create a string builder object and pass the base string as an
		// argument to the string builder constructor
		StringBuilder s1 = new StringBuilder(s);
		//step 4: create a for or for-each loop to iterate to append the given string with an appender
		for (int i = 0; i < 100000; i++) {
			s1.append(append);
		}
		//step 5: calculate the time take by subtracting start time with actual system time
		System.out.println("Time Taken by String Builder: " + (System.currentTimeMillis() - startTime) + " ms");

		startTime = System.currentTimeMillis();
		StringBuffer s2 = new StringBuffer(s);
		for (int i = 0; i < 100000; i++) {
			s2.append(append);
		}
		System.out.println("Time Taken by String Buffer: " + (System.currentTimeMillis() - startTime) + " ms");

	}

}

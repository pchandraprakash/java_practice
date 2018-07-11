package stringsPractice;

import java.util.regex.Pattern;

public class RegExpDemo {

	public static void main(String[] args) {

		String s1 = "this is a string s1";
		String s2 = "123456789";
		String s3 = "12345abcdeABCDE!@#$%";
		String s4 = "as";

		/*
		 * System.out.println(Pattern.matches(".s", s4));//matching only one particular
		 * character System.out.println(Pattern.matches("[amn]", "aaaaa"));
		 * System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
		 * System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false
		 * (more than 6 char) System.out.println(Pattern.matches("[a-zA-Z0-9]{6}",
		 * "arun$2"));//false ($ is not matched)
		 * System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
		 */ System.out.println(Pattern.matches("[312]{1}[0-9]{9}", "3123839715"));


	}

}

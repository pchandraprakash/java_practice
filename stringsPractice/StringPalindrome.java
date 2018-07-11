package stringsPractice;

import java.util.Scanner;

public class StringPalindrome {
	//problem: check for palindrome
	
	//step 1: create a static method which takes string argument and return boolean object
	public static boolean palindromeCheck(String str) {
		//step 2: create a string buffer or string builder object and pass the string variable as an argument
		StringBuilder s = new StringBuilder(str);
		//step 3: reverse the string and store it in a variable
		s.reverse();
		String rev = s.toString();
		//step 4: compare the actual string with a reversed string using equals method.
		if(str.equals(rev)) {
			return true;
		} else return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string to check for palindrome: ");
		String str = scan.next();
		System.out.println(palindromeCheck(str));
	}

}

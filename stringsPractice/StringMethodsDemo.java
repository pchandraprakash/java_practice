package stringsPractice;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s1 = "happy coding";
		String s2 = "happy coding";
		System.out.println(s1.charAt(7));
		//display first and last character of a string
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(s1.length()-1));
		//display all the elements at odd index
		for(int i=0;i<=s1.length()-1; i++) {
			if(i%2!=0) {
			System.out.println("char at index "+i+" is: "+s1.charAt(i));
			}
		}
		
		System.out.println(s1.compareTo(s2));

	}

}

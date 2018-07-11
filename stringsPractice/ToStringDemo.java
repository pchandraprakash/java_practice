package stringsPractice;

public class ToStringDemo {
	
	int id;
	String className;
	String department;
	
	public ToStringDemo(int id, String className, String department) {
		this.id = id;
		this.className = className;
		this.department = department;
	}
	
	public String toString() {
		return id+" "+className+" "+department;
	}

	public static void main(String[] args) {
		
		ToStringDemo s1 = new ToStringDemo(101,"oomd","cs");
		System.out.println(s1);
	}

}

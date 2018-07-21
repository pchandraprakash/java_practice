package encapsulationDemo;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Phanindra Chandraprakash");
		e1.setEmpID(9771);
		e1.setEmailID("phanindra.chandraprakash@gmail.com");
		e1.setSalary("$80000");
		
		System.out.println(e1.getName());
		System.out.println(e1.getEmpID());
		System.out.println(e1.getEmailID());
		System.out.println(e1.getSalary());
	}
}

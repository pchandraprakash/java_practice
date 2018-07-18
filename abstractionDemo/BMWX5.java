package abstractionDemo;

public class BMWX5 extends BMW{

	@Override
	public void make(String manufacturer) {
		System.out.println("BMW");
		
	}

	@Override
	public void model(String modelName) {
		System.out.println("BMW X5");
		
	}

	@Override
	public void gear(int gearNumber) {
		System.out.println("gear type: " + 6 );
		
	}

	@Override
	public void speed(int milesPerHour) {
		System.out.println("top speed: " + 180 +" mph" );
		
	}

	@Override
	String bmwRule(String rule) {
		return "this rule is for BMW X5";
	}
}

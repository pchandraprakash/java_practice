package abstractionDemo;

abstract class BMW implements Car {
	
	public void bmwMethod() {
		System.out.println("this is a BMW custom method");
	}
	
	abstract String bmwRule(String rule);
}

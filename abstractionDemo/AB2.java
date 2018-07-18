package abstractionDemo;

public class AB2 extends AB1 {
	//method which extends abstract class MUST implement all the abstract methods
	@Override
	int addNum(int a, int b) {
		return a+b;
	}

	@Override
	int subNum(int a, int b) {
		return a-b;
	}
}
package polymorphismDemo;

public class MainBank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println("bank ROI: "+bank.getRateOfInterest());
		
		Bank citi = new CITI();
		System.out.println("citi bank ROI: "+citi.getRateOfInterest());
		
		Bank chase = new CHASE();
		System.out.println("chase bank ROI: "+chase.getRateOfInterest());

		Bank bofa = new BOFA();
		System.out.println("bofa bank ROI: "+bofa.getRateOfInterest());
	}

}

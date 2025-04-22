package Week03.Day02;

public class Car extends Vehicle {
	
	public void advancedBrake() {
		System.out.println("Advanced brake");

	}
	
	

	public static void main(String[] args) {
		Car carOptions=new Car();
		carOptions.applyBrake();
		carOptions.advancedBrake();

	}

}

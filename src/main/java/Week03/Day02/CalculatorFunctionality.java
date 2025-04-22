package Week03.Day02;

public class CalculatorFunctionality {
	
	//AdditionFunctionality
	//Addition of two numbers
	//Addition of three numbers
	//Addition of 2 decimals
	
	//Static polymorphism - Method overloading
	
	public void addNumbers(int a,int b) {
		
		System.out.println(a+b);
}
	
	public void addNumbers(int a, int b, int c) {
		System.out.println(a+b+c);

	}
	
	public void addNumbers(float a, int b) {
		System.out.println(a+b);

	}
	
	public void addNumbers() {
		System.out.println("Empty methods");

	}
	
	public static void main(String[] args) {
		CalculatorFunctionality calc=new CalculatorFunctionality();
		calc.addNumbers();
		
	}
	
	

	
}

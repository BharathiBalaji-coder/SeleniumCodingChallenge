package Week8.Day1;

public class LearnThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age =-18;
		
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}
		
		if(age<=0) {
			throw new ArithmeticException("Age is negative");
		}
		
	}

}

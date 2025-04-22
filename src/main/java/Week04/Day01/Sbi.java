package Week04.Day01;

public class Sbi implements Rbi {
	
	public void provideCarLoan() {
	System.out.println("5 Lakhs");

	}

	@Override
	public void setInterestRate() {
	System.out.println("4.5%");
		
	}

	@Override
	public void verifyKyc() {
		System.out.println("PAN is Mandatory");
		
	}
	public static void main(String[] args) {
		Sbi sbiService=new Sbi();
		sbiService.setInterestRate();
		sbiService.verifyKyc();
	}
	
	
}

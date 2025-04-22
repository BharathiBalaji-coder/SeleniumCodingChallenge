package Week04.Day01;



public class ImplementAxis extends Axis {

	@Override
	public void setInterestRate() {
		System.out.println("10%");
		
	}

	@Override
	public void verifyKyc() {
		System.out.println("Driving License");
		
	}

	@Override
	public void provideHouseLoan() {
		System.out.println("30 Lakhs");
		
	}
	
	@Override
	public void provideGoldLoan() {
		super.provideGoldLoan();
		//System.out.println("2 Lakh");
	}
	
	
	
	
	public static void main(String[] args) {
		ImplementAxis axisService=new ImplementAxis();
		axisService.setInterestRate();
		axisService.verifyKyc();
		axisService.provideHouseLoan();
		axisService.provideGoldLoan();
	}

}

//ImplementAxis extends Axis implements Rbi
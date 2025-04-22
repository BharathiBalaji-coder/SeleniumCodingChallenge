package Week04.Day01;

public class Hdfc implements Rbi {

	@Override
	public void setInterestRate() {
		System.out.println("5.5%");
		
	}

	@Override
	public void verifyKyc() {
		System.out.println("Aadhar Mandatory");
		
	}
	
	public static void main(String[] args) {
		Hdfc hdfcService=new Hdfc();
		hdfcService.verifyKyc();
		hdfcService.setInterestRate();
	}

}

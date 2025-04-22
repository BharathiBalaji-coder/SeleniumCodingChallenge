package Week02.Day01;

public class LearnAccess1 {
	
	public void depositAmount() {
    System.out.println("Deposit");		

	}
	
	private void withdrawnAmount() {
		System.out.println("Withdrawn");

	}
	
	void knowATM() {
		System.out.println("1234");
	}
	

	public static void main(String[] args) {
		LearnAccess1 bank=new LearnAccess1();
		bank.depositAmount();
		bank.withdrawnAmount();
		bank.knowATM();

	}

}

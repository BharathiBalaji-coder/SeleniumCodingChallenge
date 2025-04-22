package Week02.Day01;

public class LearnReturntypes {
	
	public int applyBrake() {
		System.out.println("Brake");
		return 7;
	}
	
	public void applyHorn() {
		System.out.println("Applied horn");
	}
	
	

	public static void main(String[] args) {
		LearnReturntypes carOptions=new LearnReturntypes();
		
		System.out.println(carOptions.applyBrake());
		
		carOptions.applyHorn();
	}

}

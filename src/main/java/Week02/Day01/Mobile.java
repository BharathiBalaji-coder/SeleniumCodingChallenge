package Week02.Day01;

public class Mobile {
	
	public void sendSms(String sms, int numberOfMessage) {
		
     System.out.println(sms+" "+numberOfMessage);

	}
	
	public static void main(String[] args) {
		Mobile mobileOptions=new Mobile();
		
		mobileOptions.sendSms("Welcome",7);
		
		mobileOptions.sendSms("Selenium Java",5);
		
		mobileOptions.sendSms("Vineeth", 1);
		
	}

}

package Week02.Day01;

public class LearnMethods {
	
	public void takePhoto() {
		System.out.println("Take photo");
	}
	
	public void saveContact() {
		System.out.println("Contact was saved");
		
	}
	
	public void makeCall() {
		System.out.println("Make Call");

	}
	
   public static void main(String[] args) {
		
		//ClassName objectName=new ClassName();
 
		LearnMethods mobileOptions=new LearnMethods();
		
		mobileOptions.takePhoto();
		
		mobileOptions.saveContact();
		
		mobileOptions.makeCall();
	}

}

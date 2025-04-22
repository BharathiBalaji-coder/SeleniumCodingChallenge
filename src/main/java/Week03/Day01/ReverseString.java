package Week03.Day01;

public class ReverseString {

	public static void main(String[] args) {
		String str="Selenium"; 
  
		char[] charArray=str.toCharArray();
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}
  }

}

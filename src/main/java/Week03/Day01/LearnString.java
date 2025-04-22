package Week03.Day01;

public class LearnString {

	public static void main(String[] args) {
		// Literal
		String str="TestLeaf";
		System.out.println(str);
		String str1="TestLeaf";
		
		//By instantiation
		String name=new String("TestLeaf");
		String name1=new String("TestLeaf");
		
	     //.equals - compare the values of 2 Strings
		//==      - compare the reference address of 2 Strings
		
		//.equals
		System.out.println(str.equals(str1));
		System.out.println(str.equals(name1));
		
		
		//==
		System.out.println(str==str1);
		System.out.println(name==name1);
		System.out.println("Literal:"+(str==name));
		
		
		     
		String batchName="SelJanAndFeb";
		//To get the length
		int lengthOfString = batchName.length();
		System.out.println("Length is: "+lengthOfString);
		
		//Contains - compare the partial value
		System.out.println(batchName.contains("Jan"));
		
		//To uppercase- convert entire string into uppercase
		//SELJANANDFEB
		
		System.out.println(batchName.toUpperCase());
		
		String batch="Selenium";
		//charAT -index
		 System.out.println(batch.charAt(3));
		
		//toCharArray - String into Character Array
		char[] characters = batch.toCharArray();
		//characters ={'S','e','l','e','n','i','u','m'}
		System.out.println(characters[3]);
		
		for (int i = 0; i < characters.length; i++) {
			System.out.println(characters[i]);
		}
		
		//SubString- To crop a String into its lower format
		
		String names="JanandFeb";
		String substring = names.substring(4);
		System.out.println(substring);
		
		String substring2 = names.substring(2, 5);
		System.out.println(substring2);
		
		//Split - convert 1 String multiple Strings
		String batches="Sel Jan Feb";
		        // 0      1     2
		// split={"Sel" "Jan" "Feb"}
		
		String[] split = batches.split(" ");
		System.out.println(split[1]);
		
		
		//replaceAll
		String price="42000Rupees";       //42210 ,$
		String originalPrice = price.replaceAll("[A-Za-z]", "" );
		System.out.println(originalPrice);
		
		//Add GST 2000 rupees to it
		System.out.println(originalPrice+2000);
		
		//Convert the string into integer
		int priceInNumber = Integer.parseInt(originalPrice);
		System.out.println(priceInNumber+2000);
	}

}

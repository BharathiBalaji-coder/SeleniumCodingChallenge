package Week03.Day01;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		//Array Instantiation
		
		int[] marks=new int[5];
		marks[0]=67;
		marks[1]=78;
		marks[2]=56;
		marks[3]=100;
		marks[4]=90;
		
		
		// Array Literal
		//To store scores for a learner in subjects
		   int[] scores= {0,67,78,72,90};
		   
		   String[] name= {"Vin"," ", "V"};
		   
		
		//To get the number of data-length
		int lengthOfArray=scores.length;
		System.out.println("Length of an array: "+lengthOfArray);
		
		//To retrieve a particular value - index
		System.out.println(scores[1]);
		
		//To retrieve all the values
	
	     for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			}
		
		//To sort the array - ascending order
		Arrays.sort(scores);
		
		//int[] scores= {67,78,89,72,90}; - before sorting
		//int[] scores= {67,72,78,89,90};  -after sorting
		
	     //To get the lowest value
	      System.out.println(scores[0]);
	    
	    //To get the highest value
          System.out.println(scores[lengthOfArray-1]);
}

}

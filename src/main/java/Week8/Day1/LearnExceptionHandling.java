package Week8.Day1;

public class LearnExceptionHandling {
	
	
public static void main(String[] args) {
	
	int a=10;
	
	try {
		
		int[] arr=new int[-2];
		arr[0]=10;
		arr[1]=20;
		System.out.println(arr[2]);
		
	}
	
	
	finally {
		System.out.println("Invalid input");
		System.out.println("Get the report");
	}
	
    
	}

}
//NegativeArraySizeException
//ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
//IndexOutOfBoundsException extends RuntimeException
//RuntimeException extends Exception

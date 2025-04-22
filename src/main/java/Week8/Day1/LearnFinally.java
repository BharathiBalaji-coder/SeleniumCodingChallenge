package Week8.Day1;

public class LearnFinally {
	
	
public static void main(String[] args) {
	
	int a=10;
	
	try {
		//System.out.println(a/0);
		int[] arr=new int[-2];
		arr[0]=10;
		arr[1]=20;
		System.out.println(arr[2]);
		//number/0  ArithmeticException
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	
	catch (NegativeArraySizeException e) {
		System.out.println(e);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
	     
	System.out.println("Task done");
	}

}
//NegativeArraySizeException
//ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
//IndexOutOfBoundsException extends RuntimeException
//RuntimeException extends Exception

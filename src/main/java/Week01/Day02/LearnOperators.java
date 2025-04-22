package Week01.Day02;

public class LearnOperators {

	public static void main(String[] args) {
		
		//Java Operators
		
		//Assignment operator (=)
		int number=7;
		String name="Feb2025 and Non IT Jan";
		
		//Arithmetic operator (Add,sub, mul, div, mod)
		
	    int a=6;
		int b=4;
		
		//Add (+)
		System.out.println(a+b);
		
		//Sub (-)
		System.out.println(a-b);
		
		//Mul (*)
		System.out.println(a*b);
		
		//To get quotient (/)
		System.out.println(a/b);
		
		//To get remainder (%)
		System.out.println(a%b);
		
		System.out.println("------------------");
		
		//Comparison operator - Compare 2 values
		
		int c=3;
		int d=5;
		
        //equalTo (==)
		System.out.println(c==d);
		
		//notEqualTo (!=)
		System.out.println(c!=d);
		
		//lessThan  (<)
		System.out.println(c<d);
		
		//greaterThan   (>)
		System.out.println(c>d);
		
		//lessThanOrEqualTo  (<=) 
		System.out.println(c<=d);   
		
		//greaterThanOrEqualTo  (>=)
		System.out.println(c>=d);  
		
		System.out.println("----------");
		
		////Logical operator  2 Conditions
		//And operator &&   
		//Or operator  ||    
		
		int s=4;
		int v=5;
		
		//And operator
		System.out.println(s<v&&s<=v);
		
		//Or Operator
		System.out.println(s>v||s<v);   //4>5    4<5
		
		System.out.println("--------------");
		
		//Increment or decrement operator
		//Increment- preIncrement, postIncrement
		//postIncrement -Increase the number by 1
		
		int r=7;
		System.out.println(r++); //7 
		
		System.out.println(r);   //8
		
		//preIncrement -Increase the number by 1     
		System.out.println(++r); //9 
	
	    //postDecrement -Decrease the number by 1 
		System.out.println(r--); //9
	    System.out.println(r);   //8
		
		//preDecrement-Decrease the number by 1   
		System.out.println(--r); //7
		System.out.println(r);   //7
		
   }

}

package Week04.Day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//List-Interface
		//ArrayList-Implementation Class
		
		//Declare an empty List
		List<String> learnersName=new ArrayList<String>();
		System.out.println("The list is: "+learnersName);
		
		//Add an element to List
		learnersName.add("Karthik");
		System.out.println("The List after adding 1 data: "+learnersName);
		
       //Add multiple names
		learnersName.add("Rajesh");
		learnersName.add("Dinesh");
		System.out.println("The list after adding multiple data: "+learnersName);
		
		//Add duplicate
		learnersName.add("Rajesh");
		System.out.println("The List after adding duplicate value: "+learnersName);
		
		//Add by index
		learnersName.add(1, "Vineeth");
		//learnersName.add(" ");
		System.out.println("The List after adding Vineeth: "+learnersName);
		
		//Remove an element
		learnersName.remove(2);
		System.out.println("The List after deleting an element: "+learnersName);
		
		//Retrieving an element - get using index
		String index1Value = learnersName.get(1);
		System.out.println("Data at 1st Index: "+index1Value);
		
		//Size method
		int sizeOfList = learnersName.size();
		System.out.println("Size of List is: "+sizeOfList);
		
		//Sort - To arrange in Ascii order
		Collections.sort(learnersName);
		System.out.println("List after sorting is: "+learnersName);
		
		//addAll - To add all the elemnets from one List to another List
		
		//learnersName  --> employees
		
		List<String> employees=new ArrayList<String>();
		System.out.println("Employee List is: "+employees);
		
		//addAll
		employees.addAll(learnersName);
		System.out.println("Current employee List is : "+employees);
		
		//clear - clear the data from a list
		learnersName.clear();
		System.out.println(learnersName);
		
	}

}

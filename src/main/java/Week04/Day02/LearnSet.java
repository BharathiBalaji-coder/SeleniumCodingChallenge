package Week04.Day02;

import java.util.*;

public class LearnSet {

	public static void main(String[] args) {
		
		//HashSet
		//Set<String> mentors=new HashSet<String>();
		
		//TreeSet
		Set<String> mentors=new TreeSet<String>();
		
		//LinkedHashSet
		//Set<String> mentors=new LinkedHashSet<String>();
		
		//EmptySet
		System.out.println("The set is : "+mentors);
		
		//add
        mentors.add("Bhuvanesh");
        mentors.add("Vinoth");
        mentors.add("Muthu");
        mentors.add("Harrish");
        
        System.out.println("Set is :"+mentors);
        
        //Adding the duplicate value
        mentors.add("muthu");
        System.out.println("Set after duplicate: "+mentors);
        
        //Removing an element
        mentors.remove("muthu");
        System.out.println("The set after removing: "+mentors);
        
        //Size
        int sizeOfSet = mentors.size();
        System.out.println("The set size is: "+sizeOfSet);
        
        //addAll - add all the elements from one set to another set
        Set<String> trainers=new LinkedHashSet<String>();
        //Empty
        System.out.println("The trainers set is: "+trainers);
        
        trainers.addAll(mentors);
        System.out.println("The current trainers set is: "+trainers);
        
        //To retrieve a particular
        //Convert  the set into list
        //Then i can use get method
        
      //Convert  the set into list
        //SetName-trainers
        List<String> allTrainers=new ArrayList<String>(trainers);
        System.out.println("The trainers list is: "+allTrainers);
        
        String string = allTrainers.get(1);
         System.out.println(string);
        
       }

}

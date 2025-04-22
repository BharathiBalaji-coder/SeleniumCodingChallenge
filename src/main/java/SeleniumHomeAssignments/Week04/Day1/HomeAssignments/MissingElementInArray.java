package SeleniumHomeAssignments.Week04.Day1.HomeAssignments;

import java.util.Arrays;

public class MissingElementInArray {

    /*
    Declare an array {1, 2, 3, 4, 10, 6, 8}.
- Do a comparison check if there is a gap in the sequence of numbers.
- Print the numbers that are missing.
hints:
- Arrange the collection in ascending order
- Inside the loop, check the current element + 1 is not equal to the next element. This comparison checks if
there is a gap in the sequence of numbers
- Use the get() method to get an element from the list
- Print the number if a gap is detected.

     */

    public static int findMissingElement(int[] arr){

        int n=arr.length+1;
        int totalSum=n*(n+1)/2;
        int arraySum =0;
        for(int i=0;i<arr.length;i++){
            arraySum+=arr[i];
        }
        return totalSum-arraySum;



    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,5};

        int missingElement =findMissingElement(arr);
        System.out.println("Missing Element is: "+missingElement);

    }
}
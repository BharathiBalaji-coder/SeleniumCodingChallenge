package Week04.Day1.HomeAssignments;

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

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 10, 6, 8};

        // Sort the array
        Arrays.sort(arr);

        // Find and print the missing elements
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                    System.out.println("Missing element: " + j);
                }
            }
        }
    }
}
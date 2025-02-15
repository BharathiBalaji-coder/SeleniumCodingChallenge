package Week03HomeAssignments;


import java.util.Arrays;

/**
 * Assignment Details:
 * Find the missing element in the given array
 * Input -> {1, 4,3,2,8, 6, 7};
 * Output -> 5
 * Requirements: - Create a Java class named FindMissingElement. - Add a main method in the FindMissingElement class, either by typing it or using a shortcut
 * (Type main, ctrl+space & Enter). - Inside the main method, write java code to print Missing Number in the console. - Save the code and run the program (right-click -> Run as -> Java Application).
 * Hints to Solve:
 * •  Sort the array
 * •  Loop through the array (start i from arr[0] till the length of the array)
 * •  Check if the iterator variable is not equal to the array values respectively
 * • Print the number
 * • Once printed break the iteration
 * Expected Outcome:
 * Upon completion, you should be able to understand
 * 1. How to initialize the for loop effective to solve a problem
 * 2. How to use if condition effectively for comparing values and solve the problem
 * 3. The logic to identify missing element in array which is having sequential values
 */
public class FindMissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 8, 6, 7};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=(i+1)){
                System.out.println("Missing number: "+(i+1));
                break;
            }
        }

    }
}

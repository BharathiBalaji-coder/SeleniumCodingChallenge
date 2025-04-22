package SeleniumHomeAssignments.Week03Day01;

import java.util.Arrays;


public class FindDups {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 7, 5, 9, 2, 3};
        findDuplicateNumbers(arr);
    }

    private static void findDuplicateNumbers(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Duplicate number: " + arr[i]);
            }
        }
    }
}
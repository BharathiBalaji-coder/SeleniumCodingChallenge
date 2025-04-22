package SeleniumHomeAssignments.Week03HomeAssignmentsDay01;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        // Step 1: Define two input strings
        String str1 = "stops";
        String str2 = "potss";

        // Step 2: Check if the lengths of the two strings are equal
        if (str1.length() != str2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
            return; // Exit the program
        }

        // Step 3: Convert both the strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Step 4: Sort both the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Step 5: Check if the sorted arrays are equal
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }
    }
}



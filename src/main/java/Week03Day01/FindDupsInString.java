package Week03Day01;

import java.util.Arrays;

public class FindDupsInString {
    public static void main(String[] args) {
        String str = "Java";
        findDuplicateCharacter(str);
    }

    private static void findDuplicateCharacter(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == (arr[i + 1])) {
                System.out.println("Duplicate character: " + arr[i]);
            }
        }
    }
}


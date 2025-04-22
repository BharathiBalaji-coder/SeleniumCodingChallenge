package SeleniumHomeAssignments.Week03Day01;

public class ReverseString {
    public static void main(String[] args) {

        String str= "BharathiBalaji";
        System.out.println("Original String: " + str);
            char[] reverse= str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(reverse[i]);
        }
    }
}

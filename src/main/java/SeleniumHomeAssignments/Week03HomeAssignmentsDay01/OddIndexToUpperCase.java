package SeleniumHomeAssignments.Week03HomeAssignmentsDay01;

public class OddIndexToUpperCase {
    public static void main(String[] args) {
        String test = "changeme";
        //convert the given string to character array

        char[] charArray = test.toCharArray();
        //Implement a loop to iterate through each character of the String (from end to start)
        for (int i = 0; i < charArray.length; i++) {
            //check if the index is odd
            if (i % 2 != 0) {
                //convert the character to upper case
                charArray[i] = Character.toUpperCase(charArray[i]);
                System.out.println(charArray[i]);
            }
        }


    }
}

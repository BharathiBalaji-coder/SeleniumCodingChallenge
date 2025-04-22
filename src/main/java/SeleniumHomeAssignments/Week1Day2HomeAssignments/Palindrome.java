package SeleniumHomeAssignments.Week1Day2HomeAssignments;

public class Palindrome {

    public static void main(String[] args){

        int number = 121; // It is the number variable to be checked for palindrome
        int originalNumber = number;
        int reversedNumber = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }







    }
}

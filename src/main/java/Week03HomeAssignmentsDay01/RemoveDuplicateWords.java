package Week03HomeAssignmentsDay01;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        /*
        Remove the duplicate words from a String with the input:
        String text = “We learn Java basics as part of java sessions in java week1”;
         Expected output: “We learn Java basics as part of sessions in week1”
*/
        String text = "We learn Java basics as part of java sessions in java week1";
        int count;
        //Split the string into words
        String[] words = text.split(" ");
        //Create two nested for loops to compare each word with every other word in the String array
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                //If a duplicate word is found, set the word to an empty string
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }
            //If the word is not a duplicate, print the word
            if (count == 1 && words[i] != "")
                System.out.print(words[i] + " ");
        }


    }
}

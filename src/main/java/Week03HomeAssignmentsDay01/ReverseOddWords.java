package Week03HomeAssignmentsDay01;


public class ReverseOddWords {
    public static void main(String[] args) {

        String test = "I am a software tester";
        String[] words = test.split(" ");
        for (int i = 0; i < words.length; i++) {

            if (i % 2 != 0) {
                char[] charArray = words[i].toCharArray();
                int left = 0;
                int right = charArray.length - 1;
                while (left < right) {
                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    left++;
                    right--;
                }
                words[i] = new String(charArray);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
        System.out.println("Output: " + result.toString().trim());
    }
}
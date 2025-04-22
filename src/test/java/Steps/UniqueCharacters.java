package Steps;

import java.util.HashSet;

public class UniqueCharacters {

    static int unique(String str) {

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set.size();

    }
    public static void main (String[] args){
        String str = "bharathi";
        System.out.println("Number of unique characters in the string are: " + unique(str));
    }
}

package string_problems;

import java.util.Set;

public class FirstFromLastNonRepeatingChar {
    public static void main(String[] args) {
        String word = "aaliishann";
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(String.valueOf(word.charAt(i)))) {
                result += String.valueOf(word.charAt(i));
            }
        }
        System.out.println(result.charAt(result.length() - 1));


    }
}

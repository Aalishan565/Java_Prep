package _3_string_problems;

import java.util.HashSet;

public class _12_StringUniqueSubSequences {

    public static void main(String[] args) {
        String s = "aaa";
        HashSet<String> set = new HashSet();
        subSequence(s, 0, "", set);
    }

    //Complexity 2^n
    public static void subSequence(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        char currentChar = str.charAt(index);
        // to be in
        subSequence(str, index + 1, newString + currentChar, set);
        // to be not to in
        subSequence(str, index + 1, newString, set);
    }

}

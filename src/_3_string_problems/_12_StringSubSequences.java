package _3_string_problems;

public class _12_StringSubSequences {

    public static void main(String[] args) {
        String s = "abc";
        subSequence(s, 0, "");
    }

    //Complexity 2^n
    public static void subSequence(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        // to be in
        subSequence(str, index + 1, newString + currentChar);
        // to be not to in
        subSequence(str, index + 1, newString);
    }


}

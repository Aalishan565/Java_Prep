package _3_string_problems;

public class _4_StringPalindrome {

    public static void main(String[] args) {
        String input = "kabbak";
        System.out.println(isStringPalindrome(input));
    }

    private static boolean isStringPalindrome(String input) {
        int begin = 0;
        int end = input.length() - 1;
        while (begin < end) {
            if (input.charAt(begin) != input.charAt(end)) {
                return false;
            } else {
                begin++;
                end--;
            }
        }
        return true;
    }

}

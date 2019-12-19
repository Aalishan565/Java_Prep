package string_problems;

public class StringPalindrome {
    public static void main(String[] args) {
        String input = "kabbak";
        int i;
        int begin = 0;
        int end = input.length() - 1;
        int mid = (begin + end) / 2;
        for (i = 0; i <= mid; i++) {
            if (input.charAt(begin) == input.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
        if (i == mid + 1) {
            System.out.println(i);
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

}

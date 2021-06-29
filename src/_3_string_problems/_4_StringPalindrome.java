package _3_string_problems;

public class _4_StringPalindrome {

    public static void main(String[] args) {
        String input = "kabbak";
        int index;
        int begin = 0;
        int end = input.length() - 1;
        int mid = (begin + end) / 2;
        for (index = 0; index <= mid; index++) {
            if (input.charAt(begin) == input.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
        if (index == mid + 1) {
            System.out.println(index);
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

}

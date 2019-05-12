package genral;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "aabbaa";
        int begin = 0;
        int end = s.length() - 1;
        int mid = (begin + end) / 2;
        int i = 0;
        for (i = 0; i <= mid; i++) {
            if (s.charAt(begin) == s.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
        if (i == mid + 1) {
            System.out.println("mid + 1" + mid + 1);
            System.out.println("i" + i);
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}

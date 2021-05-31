package _3_string_problems;

public class _11_findTheLengthOfLastWorld {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s1) {
        String s = s1.trim();
        if (s.trim().equals("")) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char v = s.charAt(i);
            if (v == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}

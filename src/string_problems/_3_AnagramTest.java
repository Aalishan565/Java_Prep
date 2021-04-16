package string_problems;

import java.util.Arrays;

public class _3_AnagramTest {
    public static void main(String[] args) {
        String s1 = "aabbcc";
        String s2 = "abcab";
        System.out.println(isAnagram(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);

    }
}

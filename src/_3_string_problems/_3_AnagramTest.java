package _3_string_problems;

import java.util.Arrays;
import java.util.HashMap;

public class _3_AnagramTest {
    private static int CHARACTER_RANGE = 256;

    public static void main(String[] args) {
        String s1 = "aabbcc";
        String s2 = "bbaacc";
        System.out.println(isAnagramUsingHashMap(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);

    }

    public static boolean isAnagramCounting(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < input1.length(); i++) {
            count[input1.charAt(i)]++;
            count[input2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramUsingHashMap(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap();
        for (int i = 0; i < input1.length(); i++) {
            if (hm.containsKey(input1.charAt(i))) {
                int count = hm.get(input1.charAt(i));
                hm.put(input1.charAt(i), ++count);
            } else {
                hm.put(input1.charAt(i), 1);
            }
        }
        for (int i = 0; i < input2.length(); i++) {
            if (hm.containsKey(input2.charAt(i))) {
                int count = hm.get(input2.charAt(i));
                hm.put(input2.charAt(i), --count);
            }
        }

        for (int i = 0; i < input2.length(); i++) {
            if (hm.containsKey(input2.charAt(i))) {
                hm.remove(input2.charAt(i));
            }
        }
        if (hm.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

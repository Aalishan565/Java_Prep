package _4_array;

import java.util.HashMap;

public class _7_3_AnagramsOfSubStringInGivenString {

    public static void main(String[] args) {
        String str = "aabcbccba";
        String subString = "abc";
        findSubStringAnagrams(str, subString);
    }

    private static void findSubStringAnagrams(String str, String subString) {
        int startIndex = 0;
        int endIndex = 0;
        int k = subString.length();
        HashMap<Character, Integer> patternMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        for (char ch : subString.toCharArray()) {
            patternMap.put(ch, patternMap.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        while (endIndex < str.length()) {
            char currentChar = str.charAt(endIndex);
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);
            if (endIndex - startIndex + 1 == k) {
                if (patternMap.equals(windowMap)) {
                    count++;
                    System.out.println("start index of anagram is : " + startIndex);
                }
                char startChar = str.charAt(startIndex);
                if (windowMap.containsKey(startChar)) {
                    if (windowMap.get(startChar) == 1) {
                        windowMap.remove(startChar);
                    } else {
                        windowMap.put(startChar, windowMap.getOrDefault(startChar, 0) - 1);
                    }
                }
                startIndex++;
            }
            endIndex++;
        }
        System.out.println("Then anagrams counts are : " + count);
    }
}

package _4_array;

import java.util.HashMap;

public class _7_6_FindTheLargestSubStringWhoseSizeIsK {
    //Time Complexity: O(NlogN)
    // Space Complexity: O(N)

    public static void main(String[] args) {
        String givenString = "aabacbebebexyz123";
        int k = 3;
        maxSubStringUniqueCharsOfGivenSize(givenString, k);
    }

    private static void maxSubStringUniqueCharsOfGivenSize(String givenString, int k) {
        int startIndex = 0;
        int endIndex = 0;
        int largestSubStringSize = 0;
        int startIndexOfLargestSubString = 0;
        int endIndexOfLargestSubString = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (endIndex < givenString.length()) {
            char ch = givenString.charAt(endIndex);
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            while (hashMap.size() > k) {
                char startChar = givenString.charAt(startIndex);
                if (hashMap.containsKey(startChar)) {
                    if (hashMap.get(startChar) == 1) {
                        hashMap.remove(startChar);
                    } else {
                        hashMap.put(startChar, hashMap.getOrDefault(startChar, 0) - 1);
                    }
                }
                startIndex++;
            }
            if (hashMap.size() == k) {
                if (largestSubStringSize < (endIndex - startIndex + 1)) {
                    largestSubStringSize = (endIndex - startIndex + 1);
                    startIndexOfLargestSubString = startIndex;
                    endIndexOfLargestSubString = endIndex;
                }
            }
            endIndex++;
        }
        System.out.println("Largest sub array is of size : " + largestSubStringSize +
                " Found from index : " + startIndexOfLargestSubString + " to " + endIndexOfLargestSubString);
    }
}

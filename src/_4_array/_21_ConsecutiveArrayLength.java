package _4_array;

import java.util.HashSet;
import java.util.Set;

public class _21_ConsecutiveArrayLength {

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 4, 7, 9, 8};
        findLengthOfConsecutiveArray(array);
    }

    private static void findLengthOfConsecutiveArray(int[] array) {
        Set<Integer> hashSet = new HashSet<>();
        int longestSequence = 0;
        int longestSequenceSoFar = 0;
        //int startNumber = 0;
        //int endNumber = 0;
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
        for (int i = 0; i < hashSet.size(); i++) {
            if (!hashSet.contains(array[i] - 1)) {
                int number = array[i];
                // startNumber = number;
                while (hashSet.contains(number)) {
                    number++;
                }
                longestSequenceSoFar = number - array[i];
                if (longestSequence < longestSequenceSoFar) {
                    longestSequence = longestSequenceSoFar;
                    // endNumber = number - 1;
                }
            }
        }
        System.out.println("longestSequence: " + longestSequence);
        // System.out.println("start: " + startNumber);
        // System.out.println("end: " + endNumber);
    }

}

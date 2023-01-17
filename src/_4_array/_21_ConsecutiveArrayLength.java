package _4_array;

import java.util.HashSet;
import java.util.Set;

public class _21_ConsecutiveArrayLength {

    public static void main(String[] args) {
        int array[] = {2, 1, 5, 4, 7, 9, 8};
        findLengthOfConsecutiveArray(array);
    }

    private static void findLengthOfConsecutiveArray(int[] array) {
        Set<Integer> hashSet = new HashSet<>();
        int longestSequence = 0;
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
        for (int i = 0; i < hashSet.size(); i++) {
            if (!hashSet.contains(array[i] - 1)) {
                int number = array[i];
                while (hashSet.contains(number)) {
                    number++;
                }
                if (longestSequence < number - array[i]) {
                    longestSequence = number - array[i];
                }
            }
        }
        System.out.println("longestSequence: " + longestSequence);
    }

}

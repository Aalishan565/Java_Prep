package _4_array;

import java.util.HashSet;
import java.util.Set;

public class ConsecutiveArrayLength {

    public static void main(String[] args) {
        int array[] = {2, 1, 5, 4, 7, 9, 8};
        findLengthOfConsecutiveArray(array);
    }

    private static void findLengthOfConsecutiveArray(int[] array) {
        Set<Integer> hashSet = new HashSet<>();
        int longestSequence = 0;
        int startNumber = 0;
        int endNumber = 0;
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
        for (int i = 0; i < hashSet.size(); i++) {
            if (!hashSet.contains(i - 1)) {
                int number = array[i];
                startNumber = number;
                while (hashSet.contains(number)) {
                    number++;
                }
                if (longestSequence < number - array[i]) {
                    longestSequence = number - array[i];
                    endNumber = number - 1;
                }
            }
        }
        System.out.println("longestSequence: " + longestSequence);
        System.out.println("start: " + startNumber);
        System.out.println("end: " + endNumber);
    }

}

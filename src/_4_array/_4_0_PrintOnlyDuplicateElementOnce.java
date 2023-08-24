package _4_array;

import java.util.HashSet;

public class _4_0_PrintOnlyDuplicateElementOnce {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3};
        HashSet<Integer> seenElementsSet = new HashSet<>();
        System.out.println("Duplicate elements:");
        for (int element : array) {
            if (!seenElementsSet.add(element)) {
                System.out.println(element);
            }
        }
    }

}

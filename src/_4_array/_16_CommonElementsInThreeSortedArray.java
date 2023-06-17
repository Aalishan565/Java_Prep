package _4_array;

import java.util.ArrayList;
import java.util.List;

public class _16_CommonElementsInThreeSortedArray {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 3, 5, 8, 9};
        int[] array2 = {1, 2, 3, 3, 4, 4, 5, 8};
        int[] array3 = {1, 3, 8, 9};
        findCommonElement(array1, array2, array3);
    }

    private static void findCommonElement(int[] array1, int[] array2, int[] array3) {
        List<Integer> elements = new ArrayList<>();
        int indexA1 = 0;
        int indexA2 = 0;
        int indexA3 = 0;
        while (indexA1 < array1.length && indexA2 < array2.length && indexA3 < array3.length) {
            if (array1[indexA1] == array2[indexA2] && array2[indexA2] == array3[indexA3]) {
                elements.add(array1[indexA1]);
                indexA1++;
                indexA2++;
                indexA3++;
            } else if (array1[indexA1] < array2[indexA2]) {
                indexA1++;
            } else if (array2[indexA2] < array3[indexA3]) {
                indexA2++;
            } else {
                indexA3++;
            }
        }
        for (Integer i : elements
        ) {
            System.out.println(i);
        }
    }

}

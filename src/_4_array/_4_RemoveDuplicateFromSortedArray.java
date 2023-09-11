package _4_array;

import java.util.Arrays;

public class _4_RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 6};
        int[] newArray = removeNumberReturnCopyArray(array);
        for (int a : newArray) {
            System.out.println(a);
        }
    }

    private static int[] removeDuplicate(int[] array) {
        int j = 0;
        int i = 1;
        if (array.length < 2) {
            return array;
        }
        while (i < array.length) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
            i++;
        }
        int[] newArray = new int[j + 1];
        //System.arraycopy(array, 0, newArray, 0, newArray.length);
        for (int k = 0; k < newArray.length; k++) {
            newArray[k] = array[k];
        }
        return newArray;
    }


    private static int[] removeNumberReturnCopyArray(int[] array) {
        int j = 0;
        int i = 0;
        if (array.length < 2) {
            return array;
        }

        while (i < array.length) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
            i++;
        }
        return Arrays.copyOf(array, j + 1);
    }

}

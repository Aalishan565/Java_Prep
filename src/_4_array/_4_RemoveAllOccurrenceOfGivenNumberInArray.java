package _4_array;

import java.util.Arrays;

public class _4_RemoveAllOccurrenceOfGivenNumberInArray {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3};
        /*int index = removeNumber(array, 1);
         printArray(array, index);*/
        int[] finalArray = removeNumberReturnArray(array, 1);
        printArray(finalArray, finalArray.length);
    }

    private static void printArray(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
        }
    }

    private static int removeNumber(int[] array, int number) {
        int i = 0;
        int j = 0;
        while (i < array.length) {
            if (array[i] != number) {
                array[j] = array[i];
                j++;
            }
            i++;
        }
        return j;
    }

    private static int[] removeNumberReturnArray(int[] array, int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                // array[index++] = array[i];
                array[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(array, index);
    }

}

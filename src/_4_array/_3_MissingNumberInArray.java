package _4_array;

import java.util.HashMap;
import java.util.Map;

public class _3_MissingNumberInArray {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 5, 6};
        findMissingNumberUsingFormula(array);
        //missingNumberWithRepeatedElement(array);
        //missingNumber(array);
    }

    private static void findMissingNumberUsingFormula(int[] array) {
        int totalNumber = array.length + 1;
        int missingNumber;
        int expectedSum;
        int actualSum = 0;
        if (array[0] == 0) {
            expectedSum = (totalNumber * (totalNumber - 1)) / 2;
        } else {
            expectedSum = (totalNumber * (totalNumber + 1)) / 2;
        }
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }

    private static void missingNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i + 1) {
            } else {
                System.out.println(i + 1);
                break;
            }
        }
    }

    private static void missingNumberWithRepeatedElement(int[] arr) {
        // int[] arr = {4, 3, 6, 2, 1, 1};
        Map<Integer, Boolean> numberMap = new HashMap<>();
        int length = arr.length;
        for (Integer i : arr) {
            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            } else {
                System.out.println("Repeating = " + i);
            }
        }
        for (int i = 1; i <= length; i++) {
            if (numberMap.get(i) == null) {
                System.out.println("Missing = " + i);
            }
        }
    }

}

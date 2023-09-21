package _4_array;

import java.util.ArrayList;
import java.util.List;

public class _7_2_FirstNegativeNumberInEveryWindowKSize {

    public static void main(String[] args) {
        int[] array = {10, -3, 10, -2, -1, 3, 2, 4, 5, 6};
        int k = 4;
        findNegativeNumbersInEveryWindowOfKSize(array, k);
    }

    private static void findNegativeNumbersInEveryWindowOfKSize(int[] array, int k) {
        int startIndex = 0;
        int endIndex = 0;
        List<Integer> negativeNumberList = new ArrayList<>();
        while (endIndex < array.length) {
            if (array[endIndex] < 0) {
                negativeNumberList.add(array[endIndex]);
            }
            if (endIndex - startIndex + 1 == k) {
                if (!negativeNumberList.isEmpty()) {
                    System.out.println(negativeNumberList.get(0));
                    if (array[startIndex] == negativeNumberList.get(0)) {
                        negativeNumberList.remove(0);
                    }
                } else {
                    System.out.println(0);
                }
                startIndex++;
            }
            endIndex++;
        }
    }

}

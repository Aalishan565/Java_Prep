package _4_array;

public class _6_2_MaximumSumSubArray {

    public static void main(String[] args) {
        int[] array = {-3, -2, -5, -4, -1};
        // maxSumSubArrayForLoop(array);
        maxSumSubArrayUsingWhileLoop(array);
    }

    private static void maxSumSubArrayForLoop(int[] array) {
        int max_sum = Integer.MIN_VALUE;
        int max_sum_so_far = 0;
        int startIndex = 0;
        int endIndex = 0;
        int searchStartingOfSubArray = 0;
        for (int i = 0; i < array.length; i++) {
            max_sum_so_far = max_sum_so_far + array[i];
            if (max_sum < max_sum_so_far) {
                max_sum = max_sum_so_far;
                startIndex = searchStartingOfSubArray;
                endIndex = i;
            }
            if (max_sum_so_far < 0) {
                max_sum_so_far = 0;
                searchStartingOfSubArray = i + 1;
            }
        }
        System.out.println("Max sum: " + max_sum + "\n" + "Start index: "
                + startIndex + "\n" + "End index: " + endIndex);
    }

    private static void maxSumSubArrayUsingWhileLoop(int[] array) {
        int max_sum = Integer.MIN_VALUE;
        int max_sum_so_far = 0;
        int startIndex = 0;
        int endIndex = 0;
        int startIndexOfSubArray = 0;
        int endIndexOfSubArray = 0;
        while (endIndex < array.length) {
            max_sum_so_far = max_sum_so_far + array[endIndex];
            if (max_sum < max_sum_so_far) {
                max_sum = max_sum_so_far;
                startIndexOfSubArray = startIndex;
                endIndexOfSubArray = endIndex;
            }
            if (max_sum_so_far < 0) {
                max_sum_so_far = 0;
                startIndex = endIndex + 1;
            }
            endIndex++;
        }

        System.out.println("Max sum: " + max_sum + "\n" + "Start index: "
                + startIndexOfSubArray + "\n" + "End index: " + endIndexOfSubArray);
    }

}

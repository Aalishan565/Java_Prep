package _4_array;

public class _7_1_MaximumSumSubArrayOfKSize {

    public static void main(String[] args) {
        int[] array = {10, 10, 10, 1, 2, 3, 4, 5, 6};
        int k = 4;
        maxSumSubArray(array, k);
    }

    private static void maxSumSubArray(int[] array, int k) {
        int startIndex = 0;
        int endIndex = 0;
        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;
        while (endIndex < array.length) {
            runningSum = runningSum + array[endIndex];
            if (endIndex - startIndex + 1 == k) {
                maxSum = Math.max(maxSum, runningSum);
                runningSum = runningSum - array[startIndex];
                startIndex++;
            }
            endIndex++;
        }
        System.out.println("Max sum is : " + maxSum);
    }

}

package _4_array;

public class _7_5_FindTheLargestSubArrayWhoseSumIsK {
    //Time Complexity: O(NlogN)
    // Space Complexity: O(N)

    public static void main(String[] args) {
        int[] array = {4, 1, 1, 1, 3, 5};
        int k = 5;
        maxSumSubArray(array, k);
    }

    private static void maxSumSubArray(int[] array, int k) {
        int startIndex = 0;
        int endIndex = 0;
        int currentSum = 0;
        int largestSubArraySize = 0;
        int startIndexOfLargestSum = 0;
        int endIndexOfLargestSum = 0;
        while (endIndex < array.length) {
            currentSum = currentSum + array[endIndex];
            while (currentSum > k) {
                currentSum = currentSum - array[startIndex];
                startIndex++;
            }
            if (currentSum == k) {
                if (largestSubArraySize < (endIndex - startIndex + 1)) {
                    largestSubArraySize = (endIndex - startIndex + 1);
                    startIndexOfLargestSum = startIndex;
                    endIndexOfLargestSum = endIndex;
                }
            }
            endIndex++;
        }
        System.out.println("Largest sub array is of size : " + largestSubArraySize + " Found from index : " + startIndexOfLargestSum + " to " + endIndexOfLargestSum);
    }

}

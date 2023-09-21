package _4_array;

public class _6_1_ContinuesSubArrayToFindGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, -1, 4, 2, 3, 10};
        //subArraySumForLoop(arr, 15);
        subArraySumWhileLoop(arr, 15);
    }

    private static void subArraySumForLoop(int[] arr, int sum) {
        int start = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            while (currentSum > sum) {
                currentSum = currentSum - arr[start];
                start++;
            }
            if (currentSum == sum) {
                System.out.println("Sub array found from index :" + start + " to " + i);
                return;
            }
        }
        System.out.println("No sum found in the given array.");
    }

    private static void subArraySumWhileLoop(int[] arr, int sum) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        while (end < arr.length) {
            currentSum = currentSum + arr[end];
            while (currentSum > sum) {
                currentSum = currentSum - arr[start];
                start++;
            }
            if (currentSum == sum) {
                System.out.println("Sub array found from index :" + start + " to " + end);
                return;
            }
            end++;
        }
        System.out.println("No sum found in the given array.");
    }

}

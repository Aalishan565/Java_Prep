package array;

public class _6_ContinuesSubArrayToFindGivenSum {
    public static void main(String args[]) {
        int arr[] = {1, 2, -1, 4, 2, 3, 10};
        subArraySum(arr, arr.length - 1, 15);
    }

    private static void subArraySum(int[] arr, int length, int sum) {
        int i;
        int start = 0;
        int currentSum = 0;
        for (i = 0; i <= length; i++) {
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
        System.out.println("No sum found int given array.");
    }
}

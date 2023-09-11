package _4_array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _27_KthLargestElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 7, 4};
        int k = 2;
        // int result = findKthLargestUsingArray(nums, k);
        int result = findKthLargestUsingHeap(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }

    static int findKthLargestUsingArray(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static int findKthLargestUsingHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        return minHeap.peek();
    }

}

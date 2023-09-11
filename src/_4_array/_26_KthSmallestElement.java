package _4_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class _26_KthSmallestElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 7, 4};
        int k = 1;
        //int result = findKthSmallestUsingArray(nums, k);
        int result = findKthSmallestUsingHeap(nums, k);
        System.out.println("The " + k + "th Smallest element is: " + result);
    }

    private static int findKthSmallestUsingArray(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k - 1];
    }

    public static int findKthSmallestUsingHeap(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            maxHeap.offer(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(nums[i]);
            }
        }
        return maxHeap.peek();
    }

}

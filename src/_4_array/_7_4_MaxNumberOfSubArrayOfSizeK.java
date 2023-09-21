package _4_array;

import java.util.Collections;
import java.util.PriorityQueue;

public class _7_4_MaxNumberOfSubArrayOfSizeK {
    //Time Complexity: O(NlogN)
    // Space Complexity: O(N)

    public static void main(String[] args) {
        int[] array = {1, 3, -1, 4, 0, 5, -4, 9, 8};//3,4,4,5,9,9
        int k = 3;
        maxSumSubArray(array, k);
    }

    private static void maxSumSubArray(int[] array, int k) {
        int startIndex = 0;
        int endIndex = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        while (endIndex < array.length) {
            maxHeap.offer(array[endIndex]);
            if (endIndex - startIndex + 1 == k) {
                System.out.println("Max Number is :" + maxHeap.peek());
                maxHeap.remove(array[startIndex]);
                startIndex++;
            }
            endIndex++;
        }

    }

}

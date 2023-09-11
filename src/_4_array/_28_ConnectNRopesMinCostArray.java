package _4_array;

import java.util.PriorityQueue;

public class _28_ConnectNRopesMinCostArray {

    public static void main(String[] args) {
        int[] arrry = {2, 5, 4, 8, 6, 9};
        int cost = findTheMinCost(arrry);
        System.out.println(cost);

    }

    public static int findTheMinCost(int[] nums) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(nums[i]);
        }
        while (minHeap.size() > 1) {
            int firstMin = minHeap.poll();
            int secondMin = minHeap.poll();
            int sum = firstMin + secondMin;
            answer += sum;
            minHeap.offer(sum);
        }
        return answer;
    }
}

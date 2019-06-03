package array;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int array[] = {0, 1, 1, 0, 0, -9, -4, 1, 1, 0, 1, 1, 0, 0};
        int max_sum = array[0];
        int max_sum_end = 0;
        int startIndex = 0;
        int endIndex = 0;
        int searchStartingOfSubArray = 0;
        for (int i = 0; i < array.length; i++) {
            max_sum_end = max_sum_end + array[i];
            if (max_sum < max_sum_end) {
                max_sum = max_sum_end;
                startIndex = searchStartingOfSubArray;
                endIndex = i;
            }
            if (max_sum_end < 0) {
                max_sum_end = 0;
                searchStartingOfSubArray = i + 1;
            }


        }
        System.out.println(max_sum);
        System.out.println(startIndex);
        System.out.println(endIndex);
    }
}

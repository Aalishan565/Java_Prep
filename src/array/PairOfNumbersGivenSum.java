package array;

public class PairOfNumbersGivenSum {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 7, 8, 9};
        int sum = 17;
        //pairWithLoops(array, sum);
        //for binary array must be sorted
        System.out.println(pairUsingBinary(array, 0, array.length - 1, sum));
    }

    private static void pairWithLoops(int[] array, int sum) {
        int pointer1 = array[0];
        int pointer2 = array[0];
        for (int i = 0; i < array.length; i++) {
            pointer1 = array[i];
            int difference = sum - pointer1;
            for (int j = 0; j < array.length; j++) {
                if (difference == array[j]) {
                    pointer2 = array[j];
                }
            }
        }
        System.out.println(pointer1);
        System.out.println(pointer2);
    }

    static boolean pairUsingBinary(int[] array, int left, int right, int sum) {
        while (left < right) {
            if (array[left] + array[right] == sum) {
                System.out.println(array[left]);
                System.out.println(array[right]);
                return true;
            } else if (array[left] + array[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        return false;

    }
}

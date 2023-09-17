package _4_array;

public class _5_0_ArrayMovingZeroAtEnd {

    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 0, 1, 5, 1, 0, 0, 0};
        int[] arr1 = sortArrayUsingForLoop(arr);
        for (int j : arr1) {
            System.out.println(j);
        }
    }

    private static int[] sortArrayUsingForLoop(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

}

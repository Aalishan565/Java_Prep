package _4_array;

public class _5_1_ArrayMovingZeroAtStart {

    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 0, 1, 5, 1, 0, 0, 0};
        int[] arr1 = sortArrayUsingForLoop(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    private static int[] sortArrayUsingForLoop(int[] array) {
        int j = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0 && array[j] == 0) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
            if (array[j] != 0) {
                j--;
            }
        }
        return array;
    }

}

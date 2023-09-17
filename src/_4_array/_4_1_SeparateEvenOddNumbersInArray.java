package _4_array;

public class _4_1_SeparateEvenOddNumbersInArray {

    public static void main(String[] args) {
        int[] array = {2, 4, 7, 6, 1, 9, 8, 3, 10, 5};
        for (int element : separateEvenOdd(array)
        ) {
            System.out.println(element);
        }
    }

    public static int[] separateEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 != 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}

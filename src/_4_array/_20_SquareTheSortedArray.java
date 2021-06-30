package _4_array;

import java.util.Arrays;

public class _20_SquareTheSortedArray {

    public static void main(String[] args) {
        int array[] = {-5, -3, -1, 2, 4};
        int result[] = sortSquaresInOn(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }

    // Function to sort an square array in o(n) and space is also o(n)
    public static int[] sortSquaresInOn(int arr[]) {
        int n = arr.length, left = 0,
                right = n - 1;
        int result[] = new int[n];
        for (int index = n - 1; index >= 0; index--) {
            if (Math.abs(arr[left]) > arr[right]) {
                result[index] = arr[left] * arr[left];
                left++;
            } else {
                result[index] = arr[right] * arr[right];
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
        return arr;
    }

    // Function to sort an square array in nLog(n)
    public static int[] sortSquaresInNlogN(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }

}

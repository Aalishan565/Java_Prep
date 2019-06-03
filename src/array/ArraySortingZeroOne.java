package array;

public class ArraySortingZeroOne {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 0, 8};
        int firstPtr = 0;
        int lastPtr = arr.length - 1;
        // int arr1[] = sortArray(arr, firstPtr, lastPtr);
        int arr1[] = sortArray(arr);
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println(arr1[i]);

        }
    }

    private static int[] sortArray(int[] arr) {
        int j = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[j] == 0 && arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
    private static int[] sortArray(int[] arr, int firstPtr, int lastPtr) {
        while (firstPtr < lastPtr) {
            if (arr[firstPtr] == 0 && arr[lastPtr] == 1) {
                firstPtr++;
                lastPtr--;
            } else if (arr[firstPtr] == 0) {
                firstPtr++;
            } else if (arr[lastPtr] == 1) {
                lastPtr--;

            } else {
                int temp = arr[firstPtr];
                arr[firstPtr] = arr[lastPtr];
                arr[lastPtr] = temp;
                firstPtr++;
                lastPtr--;
            }

        }
        return arr;
    }
}

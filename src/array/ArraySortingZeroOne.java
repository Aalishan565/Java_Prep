package array;

public class ArraySortingZeroOne {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 1, 0};
        int firstPtr = 0;
        int lastPtr = arr.length - 1;
        int arr1[] = sortArray(arr, firstPtr, lastPtr);
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println(arr1[i]);

        }
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

package array;

public class _5_ArraySortingZeroOne {
    public static void main(String[] args) {
        //int arr[] = {2, 1, 2, 1, 0, 2, 1, 1, 1, 0, 0, 1, 2};
        int arr[] = {0, 1, 1, 0, 1, 1, 1, 0, 0, 0};
        // int arr[] = {0, 1, 2, 0, 1, 6, 1, 0, 0, 7};
        int firstPtr = 0;
        int lastPtr = arr.length - 1;
        //  int arr1[] = sortArrayZeroOneTwo(arr, firstPtr, lastPtr);
        int arr1[] = sortArray(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    private static int[] sortArray(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[j] == 1 && arr[i] != 1) {
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

    private static int[] sortArrayZeroOneTwo(int[] arr, int firstPtr, int lastPtr) {
        int mid = firstPtr;
        while (mid <= lastPtr) {
            switch (arr[mid]) {
                case 0:
                    if (arr[firstPtr] != arr[mid]) {
                        int temp = arr[firstPtr];
                        arr[firstPtr] = arr[mid];
                        arr[mid] = temp;
                    }
                    firstPtr++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    if (arr[mid] != arr[lastPtr]) {
                        int temp = arr[mid];
                        arr[mid] = arr[lastPtr];
                        arr[lastPtr] = temp;
                    }
                    lastPtr--;
                    break;
            }

        }
        return arr;
    }

}

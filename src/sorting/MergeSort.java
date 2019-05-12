package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 2, 1, 5, 4};
        sortArray(array);

        for (int a : array) {
            System.out.println(a);
        }
    }

    private static void sortArray(int[] array) {
        devideArray(array, 0, array.length - 1);
    }

    private static void devideArray(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            devideArray(array, low, mid);
            devideArray(array, mid + 1, high);
            mergeArray(array, low, mid, high);


        }
    }

    private static void mergeArray(int array[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int k = 0;
        int temp[] = new int[high - low + 1];
        while (left <= mid && right <= high) {
            if (array[left] < array[right]) {
                temp[k] = array[left];
                left++;
            } else {
                temp[k] = array[right];
                right++;
            }
            k++;
        }
        while (left <= mid) {
            temp[k] = array[left];
            left++;
            k++;
        }
        while (right <= high) {
            temp[k] = array[right];
            right++;
            k++;
        }
        for (int i = 0; i < temp.length; i++) {
            array[low + i] = temp[i];
        }
    }
}

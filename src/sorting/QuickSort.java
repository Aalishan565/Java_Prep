package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int array[] = {2,1, 3, 5, 4};
        sortArray(array, 0, array.length-1);
        printArray(array);
    }

    private static void sortArray(int[] array, int left, int right) {
        int mid = partition(array, left, right);
        if (left < mid-1) {
            sortArray(array, left, mid - 1);
        }
        if (mid < right) {
            sortArray(array, mid, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right)/2];
        while (array[left] < pivot) {
            left++;
        }
        while (array[right] > pivot) {
            right--;
        }
        if (left <= right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return left;
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ",");

        }
        System.out.println("\n");
    }
}

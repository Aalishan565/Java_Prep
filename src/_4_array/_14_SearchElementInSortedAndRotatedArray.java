package _4_array;

public class _14_SearchElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        int array[] = {4, 5, 6, 7, 8, 9, 10, 2, 3};
        int element = 3;
        int pivot = findPivotElement(array, 0, array.length - 1);
        System.out.println("Pivot " + array[pivot]);
        if (pivot != -1) {
            if (element >= array[pivot] && element <= array[array.length - 1]) {
                searchElementWithLoop(array, pivot, array.length - 1, element);
            } else {
                searchElementWithLoop(array, 0, pivot - 1, element);
            }
        }
    }

    private static void searchElementWithLoop(int[] array, int start, int end, int key) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                System.out.println("Element found: " + mid);
                return;
            } else if (array[mid] > key) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Element not found");
    }

    private static int findPivotElement(int[] array, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] > array[mid + 1]) {
            return mid + 1;
        } else if (array[start] < array[mid]) {
            return findPivotElement(array, mid + 1, end);
        } else {
            return findPivotElement(array, start, mid);
        }
    }
}

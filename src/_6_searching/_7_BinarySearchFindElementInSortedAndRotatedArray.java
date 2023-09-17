package _6_searching;

public class _7_BinarySearchFindElementInSortedAndRotatedArray {

    public static void main(String[] args) {
        int[] array = {5, 6, 7, 1, 2, 3, 4};
        int index = findElementInSortedAndRotatedArray(array, 2);
        System.out.println("Element present at index: " + index);
    }

    //Find Number in sorted and rotated array
    private static int findElementInSortedAndRotatedArray(int[] array, int key) {
        int pivot = findRotationCountInSortedArray(array);
        int index;
        if (array[pivot] <= key && key <= array[array.length - 1]) {
            index = searchElementWithLoop(array, pivot, array.length - 1, key);
        } else {
            index = searchElementWithLoop(array, 0, pivot, key);
        }
        return index;
    }

    //Find Number of Times a Sorted array is Rotated
    private static int findRotationCountInSortedArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int pivot = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && array[mid + 1] < array[mid]) {
                pivot = mid + 1;
                return pivot;
            } else if (mid > start && array[mid - 1] > array[mid]) {
                pivot = mid;
                return pivot;
            } else if (array[start] < array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return pivot;
    }

    //Binary Search with loop
    private static int searchElementWithLoop(int[] array, int start, int end, int key) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
package _6_searching;

public class BinarySearchAlgo {

    public static void main(String[] args) {
        int array[] = {5,6,7,1,2,3,4};
        //System.out.println(findMissingElementInSortedArray(array));
        //int index = searchElementWithLoop(array, 0, array.length-1, 9);
        // int index = searchElementWithRecursion(array, 0, array.length - 1, 25);
        //System.out.println(searchFirstOccurrence(array, 0, array.length - 1, 2));
        //System.out.println(searchLastOccurrence(array, 0, array.length-1, 2));
        System.out.println(findRotationCountInSortedArray(array));
        // countOccurrence(array);
        // findElementInSortedAndRotatedArray(array, 9);

    }

    //Binary Search with recursion
    private static int searchElementWithRecursion(int[] array, int start, int end, int key) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                return searchElementWithRecursion(array, start, mid - 1, key);
            } else {
                return searchElementWithRecursion(array, mid + 1, end, key);
            }
        }
        return -1;
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

    //First Occurrence
    private static int searchFirstOccurrence(int[] array, int low, int high, int key) {
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] > key)
                high = mid - 1;
            else if (array[mid] < key)
                low = mid + 1;
            else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }

    //Last Occurrence
    private static int searchLastOccurrence(int[] array, int low, int high, int key) {
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] > key)
                high = mid - 1;
            else if (array[mid] < key)
                low = mid + 1;
            else {
                result = mid;
                low = mid + 1;
            }
        }
        return result;
    }

    //Find Count of a number in sorted array
    private static void countOccurrence(int[] array) {
        int firstIndex = searchFirstOccurrence(array, 0, array.length - 1, 5);
        int lastIndex = searchLastOccurrence(array, 0, array.length - 1, 5);
        int count = lastIndex - firstIndex;
        System.out.println(++count);
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

    //Find Number in sorted and rotated array
    private static void findElementInSortedAndRotatedArray(int[] array, int key) {
        int pivot = findRotationCountInSortedArray(array);
        if (array[pivot] <= key && key <= array[array.length - 1]) {
            int index = searchElementWithLoop(array, pivot + 1, array.length - 1, key);
            System.out.println("Element present at index " + index);
        } else {
            int index = searchElementWithLoop(array, 0, pivot - 1, key);
            System.out.println("Element present at index " + index);
        }
    }

    //Binary missing element in logN
    static int findMissingElementInSortedArray(int array[]) {
        int startIndex = 0, endIndex = array.length - 1;
        int mid;
        while ((endIndex - startIndex) > 1) {
            mid = (startIndex + endIndex) / 2;
            if ((array[startIndex] - startIndex) != (array[mid] - mid)) {
                endIndex = mid;
            } else if ((array[endIndex] - endIndex) != (array[mid] - mid)) {
                startIndex = mid;
            } else {
                return -1;
            }
        }
        return (array[startIndex] + 1);
    }

}
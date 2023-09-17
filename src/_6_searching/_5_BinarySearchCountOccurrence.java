package _6_searching;

public class _5_BinarySearchCountOccurrence {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4, 6, 8, 9};
        int element = 3;
        int count = countOccurrence(array, element);
        System.out.println("The Occurrence of " + element + " is/are: " + count);
    }

    //First Occurrence
    private static int searchFirstOccurrence(int[] array, int start, int end, int key) {
        int firstOccurrence = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                firstOccurrence = mid;
                end = mid - 1;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return firstOccurrence;
    }

    //Last Occurrence
    private static int searchLastOccurrence(int[] array, int start, int end, int key) {
        int lastOccurrence = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                lastOccurrence = mid;
                start = mid + 1;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lastOccurrence;
    }

    //Find Count of a number in sorted array
    private static int countOccurrence(int[] array, int key) {
        int firstIndex = searchFirstOccurrence(array, 0, array.length - 1, key);
        int lastIndex = searchLastOccurrence(array, 0, array.length - 1, key);
        int count = lastIndex - firstIndex;
        return count + 1;
    }

}

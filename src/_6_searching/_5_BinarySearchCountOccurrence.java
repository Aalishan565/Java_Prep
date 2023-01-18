package _6_searching;

public class _5_BinarySearchCountOccurrence {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 3, 3, 4, 6, 8, 9};
        int element = 3;
        int count = countOccurrence(array, element);
        System.out.println("The Occurrence of " + element + " is/are :" + count);
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
    private static int countOccurrence(int[] array, int key) {
        int firstIndex = searchFirstOccurrence(array, 0, array.length - 1, key);
        int lastIndex = searchLastOccurrence(array, 0, array.length - 1, key);
        int count = lastIndex - firstIndex;
        return count + 1;
    }

}

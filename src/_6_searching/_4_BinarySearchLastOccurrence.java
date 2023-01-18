package _6_searching;

public class _4_BinarySearchLastOccurrence {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 3, 3, 4, 6, 8, 9};
        int index = searchLastOccurrence(array, 0, array.length - 1, 3);
        System.out.println("Last Occurrence is at " + index);
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
}



package _6_searching;

public class _3_BinarySearchFirstOccurrence {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 3, 3, 4, 6, 8, 9};
        int index = searchFirstOccurrence(array, 0, array.length - 1, 3);
        System.out.println("First Occurrence is at " + index);
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

}



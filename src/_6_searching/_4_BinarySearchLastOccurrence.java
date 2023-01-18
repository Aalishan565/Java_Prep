package _6_searching;

public class _4_BinarySearchLastOccurrence {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 3, 3, 4, 6, 8, 9};
        int index = searchLastOccurrence(array, 0, array.length - 1, 3);
        System.out.println("Last Occurrence is at " + index);
    }

    //Last Occurrence
    private static int searchLastOccurrence(int[] array, int start, int end, int key) {
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] > key)
                end = mid - 1;
            else if (array[mid] < key)
                start = mid + 1;
            else {
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }

}



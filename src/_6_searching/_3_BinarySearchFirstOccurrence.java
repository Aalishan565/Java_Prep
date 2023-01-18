package _6_searching;

public class _3_BinarySearchFirstOccurrence {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 3, 4, 6, 8, 9};
        int index = searchFirstOccurrence(array, 0, array.length - 1, 3);
        System.out.println("First Occurrence is at " + index);
    }

    //First Occurrence
    private static int searchFirstOccurrence(int[] array, int start, int end, int key) {
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] > key)
                end = mid - 1;
            else if (array[mid] < key)
                start = mid + 1;
            else {
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }

}



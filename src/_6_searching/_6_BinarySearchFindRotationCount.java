package _6_searching;

public class _6_BinarySearchFindRotationCount {

    public static void main(String[] args) {
        int[] array = {5, 6, 7, 1, 2, 3, 4};
        int rotationCount = findRotationCountInSortedArray(array);
        System.out.println("Rotation count of array is " + rotationCount);
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

}
package array;

public class BinarySearch {

    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5, 6};
        int key = 6;
        int low = 0;
        int high = array1.length - 1;
        int index = searchElement(array1, low, high, key);
        System.out.println(index);


    }

    private static int searchElement(int[] array1, int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array1[mid] == key) {
                return mid;

            } else if (array1[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

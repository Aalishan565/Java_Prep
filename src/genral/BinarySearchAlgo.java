package genral;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //  int index = searchElementWithLoop(array, 0, array.length, 9);
        int index = searchElementWithRecursion(array, 0, array.length-1, 9);
        System.out.println(index);
    }

    private static int searchElementWithRecursion(int[] array, int start, int end, int key) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                return searchElementWithRecursion(array, start, mid, key);
            } else {
                return searchElementWithRecursion(array, mid + 1, end, key);
            }

        }
        return -1;
    }

    private static int searchElementWithLoop(int[] array, int start, int end, int key) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

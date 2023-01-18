package _6_searching;

public class _1_BinarySearchWithLoop {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 6, 8, 9};
        int index = searchElementWithLoop(array, 0, array.length - 1, 9);
        System.out.println("Item found in index " + index);
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

}

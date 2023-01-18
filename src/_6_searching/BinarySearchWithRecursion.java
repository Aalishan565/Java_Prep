package _6_searching;

public class BinarySearchWithRecursion {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 6, 8, 9};
        int index = searchElementWithRecursion(array, 0, array.length - 1, 9);
        System.out.println("Item found in index " + index);
    }

    //Binary Search with recursion
    private static int searchElementWithRecursion(int[] array, int start, int end, int key) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                return searchElementWithRecursion(array, start, mid - 1, key);
            } else {
                return searchElementWithRecursion(array, mid + 1, end, key);
            }
        }
        return -1;
    }
}

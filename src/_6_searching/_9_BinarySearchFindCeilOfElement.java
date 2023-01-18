package _6_searching;

public class _9_BinarySearchFindCeilOfElement {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 6, 7, 9};
        int key = 10;
        int ceilingIndex = ceilingOfElement(array, key);
        System.out.println("Ceil of number is " + array[ceilingIndex]);
    }

    //Binary Search with loop
    private static int ceilingOfElement(int[] array, int key) {
        if (key > array[array.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
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
        return start;
    }

}
package _6_searching;

public class _9_BinarySearchFindFloorOfElement {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 6, 7, 9};
        int key = 4;
        int floorIndex = floorOfElement(array, key);
        System.out.println("Floor of number is " + array[floorIndex]);
    }

    //Binary Search with loop
    private static int floorOfElement(int[] array, int key) {
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
        return end;
    }

}
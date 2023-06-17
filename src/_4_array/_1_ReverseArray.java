package _4_array;

public class _1_ReverseArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 9};
        //reverseArray(_4_array, 0, _4_array.length - 1);
        reverseArrayWhileLoop(array, 0, array.length - 1);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.println(a);
        }
    }

    private static void reverseArray(int[] array, int start, int end) {
        if (start > end) {
            return;
        } else {
            int temp;
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverseArray(array, start + 1, end - 1);
        }
    }

    private static void reverseArrayWhileLoop(int[] array, int start, int end) {
        while (start < end) {
            int temp;
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}

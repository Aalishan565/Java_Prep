package array;

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {2, 3, 1, 4, 9};
        reverseArray(array, 0, array.length - 1);
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
}

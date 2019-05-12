package genral;

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void reverseArray(int[] array, int low, int high) {
        if (low <= high) {
            int temp;
            temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            reverseArray(array, low + 1, high - 1);
        }
    }
}

package _5_sorting;

public class _2_InsertionSort {

    public static void main(String[] args) {
        int array[] = {5, 3, 4, 2, 1};
        sortArray(array);
        printArray(array);
    }

    private static void sortArray(int[] array) {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ",");
        }
        System.out.println("\n");
    }

}

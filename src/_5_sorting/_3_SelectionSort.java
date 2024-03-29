package _5_sorting;

public class _3_SelectionSort {

    public static void main(String[] args) {
        int[] array = {5, 3, 4, 2};
        sortArray(array);
        printArray(array);
    }

    private static void sortArray(int[] array) {
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ",");
        }
        System.out.println("\n");
    }

}

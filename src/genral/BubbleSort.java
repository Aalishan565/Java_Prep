package genral;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {2, 1, 4, 3, 5, 6, 8, 7, 9};
        sortArray(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    private static void sortArray(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }
    }
}

package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 2, 1, 5, 4};
        sortArray(array);

        for (int a : array) {
            System.out.println(a);
        }
    }

    private static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

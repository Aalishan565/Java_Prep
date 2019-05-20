package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {5,3,4,2};
        sortArray(array);

       // printArray(array);
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a+",");

        }
        System.out.println("\n");
    }

    private static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    printArray(array);
                }
            }
        }
    }
}

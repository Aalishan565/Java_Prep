package _5_sorting;

public class _1_BubbleSort {

    public static void main(String[] args) {
        int[] array = {0, 4, 0, 0, 1, 3, 4, 1, 0, 2, 0};
        sortArray(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ",");
        }
        System.out.println("\n");
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // printArray(_4_array);
                }
            }
        }
    }

/*
    private static void sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            int flag=0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
*/

}

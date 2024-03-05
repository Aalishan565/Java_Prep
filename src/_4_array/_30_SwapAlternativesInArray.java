package _4_array;

public class _30_SwapAlternativesInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array.length; i += 2) {
            if (i + 1 < array.length) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item);
        }
    }

}

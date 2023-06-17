package _4_array;

public class ZigZagArray {

    public static void main(String[] args) {
        int[] array = {6, 5, 4, 3, 2, 1};
        zigZag(array);
        for (int i : array) {
            System.out.print(i + " ,");
        }
    }

    private static void zigZag(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (flag) {
                if (array[i] > array[i + 1]) {
                    swap(array, i);
                }
            } else {
                if (array[i] < array[i + 1]) {
                    swap(array, i);
                }
            }
            flag = !flag;
        }
    }

    private static void swap(int[] array, int i) {
        int temp;
        temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }

}

package array;

public class ReversalArrayRotation {
    public static void main(String[] args) {
        int array[] = {1, 2, 4, 3, 5, 6, 7, 8, 9};
        int reverseby = 7;
        int length = array.length - 1;
        int difference = length - reverseby;
        int firstStart = 0;
        int firstEnd = difference;
        int secondStart = difference + 1;
        int lastEnd = length;
        reverseWholeArray(array, firstStart, firstEnd);
        reverseWholeArray(array, secondStart, lastEnd);
        reverseWholeArray(array, firstStart, lastEnd);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    private static void reverseWholeArray(int[] array, int firstStart, int lastEnd) {
        while (firstStart < lastEnd) {
            int temp = array[firstStart];
            array[firstStart] = array[lastEnd];
            array[lastEnd] = temp;
            firstStart++;
            lastEnd--;
        }
    }

}

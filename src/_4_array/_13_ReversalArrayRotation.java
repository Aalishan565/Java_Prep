package _4_array;

public class _13_ReversalArrayRotation {
    public static void main(String[] args) {
        int array[] = {1, 2, 4, 3, 5, 6, 7, 8, 9};
        int reverseBy = 5;
        int length = array.length - 1;
        int difference = length - reverseBy;
        int firstStart = 0;
        int firstEnd = difference;
        int secondStart = difference + 1;
        int lastEnd = length;
        reverseArray(array, firstStart, firstEnd);
        reverseArray(array, secondStart, lastEnd);
        reverseArray(array, firstStart, lastEnd);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void reverseArray(int[] array, int firstStart, int lastEnd) {
        while (firstStart < lastEnd) {
            int temp = array[firstStart];
            array[firstStart] = array[lastEnd];
            array[lastEnd] = temp;
            firstStart++;
            lastEnd--;
        }
    }
}

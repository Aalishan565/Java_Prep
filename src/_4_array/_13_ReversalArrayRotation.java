package _4_array;

public class _13_ReversalArrayRotation {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int reverseBy = 5;
        int lastIndex = array.length - 1;
        int difference = lastIndex - reverseBy;
        int firstStart = 0;
        int firstEnd = difference;
        int secondStart = difference + 1;
        int lastEnd = lastIndex;
        reverseArray(array, firstStart, firstEnd);
        reverseArray(array, secondStart, lastEnd);
        reverseArray(array, firstStart, lastEnd);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void reverseArray(int[] array, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

}

package _4_array;

public class _29_RunningSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] runningSum = calculateRunningSum(array);
        for (int value : runningSum
        ) {
            System.out.println(value);
        }
    }

    private static int[] calculateRunningSum(int[] array) {
        int[] newArray = new int[array.length];
        int previousSum = array[0];
        newArray[0] = previousSum;

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                previousSum = previousSum + array[i];
                newArray[i] = previousSum;
            }
        }
        return newArray;
    }

}

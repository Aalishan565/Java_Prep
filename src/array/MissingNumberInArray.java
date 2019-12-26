package array;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int array[] = {1, 2, 4, 5, 6, 7, 9};
        findMissingNumberUsingFormula(array);
        //missingNumber(array);
    }

    private static void findMissingNumberUsingFormula(int[] array) {
        int totalNumber = array.length + 1;
        int missingNumber;
        int expectedSum = 0;
        int actualSum = 0;
        expectedSum = (totalNumber * (totalNumber + 1)) / 2;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }

    private static void missingNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == i + 1) {
            } else {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

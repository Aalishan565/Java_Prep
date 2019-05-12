package genral;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 9};
        int totalNumber = array.length + 1;
        int missingNumber;
        int expectedSum = 0;
        int actualSum = 0;
        expectedSum = totalNumber * (totalNumber + 1) / 2;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];

        }
        missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
    }
}

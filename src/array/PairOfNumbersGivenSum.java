package array;

public class PairOfNumbersGivenSum {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 7, 8, 9};
        int sum = 12;
       // pairWithLoops(array, sum);
        //for binary array must be sorted
        System.out.println(pairUsingBinary(array, 0, array.length - 1, sum));
    }

    private static void pairWithLoops(int[] array, int sum) {
        int firstNumber = 0;
        int secondNumber = 0;
        int diff = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum == (firstNumber + secondNumber)) {
                System.out.println(firstNumber);
                System.out.println(secondNumber);
                return;
            }
            firstNumber = array[i];
            diff = sum - firstNumber;
            for (int j = 0; j < array.length; j++) {
                if (diff == array[j]) {
                    secondNumber = array[j];
                    break;

                }
            }

        }
        System.out.println("No match found");
    }
    static boolean pairUsingBinary(int[] array, int left, int right, int sum) {
        while (left < right) {
            if (array[left] + array[right] == sum) {
                System.out.println(array[left]);
                System.out.println(array[right]);
                return true;
            } else if (array[left] + array[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        return false;

    }
}

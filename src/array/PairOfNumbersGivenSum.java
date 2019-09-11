package array;

import java.util.HashMap;

public class PairOfNumbersGivenSum {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 7, 8, 9};
        int sum = 9;
        // pairWithLoops(array, sum);
        //for binary array must be sorted
    //    System.out.println(pairUsingBinary(array, 0, array.length - 1, sum));
        pairUsingHash(array,sum);
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

    private static boolean pairUsingBinary(int[] array, int left, int right, int sum) {
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

    private static void pairUsingHash(int[] array, int sum) {
        HashMap<Integer,Integer> hm= new HashMap();
        for (int i = 0; i < array.length; i++) {
            if (hm.containsKey(sum-array[i])){
                int pair=hm.get(sum-array[i]);
               System.out.println(array[pair]);
                System.out.println(array[i]);
                return;
            }else {
                hm.put(array[i],i);
            }


        }
       // System.out.println(hm.entrySet());
        System.out.println("No pair found");

    }

}

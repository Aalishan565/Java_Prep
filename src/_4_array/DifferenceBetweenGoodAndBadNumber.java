package _4_array;

public class DifferenceBetweenGoodAndBadNumber {

    public static void main(String[] args) {
        int[] array1 = {0, 4, 0, 0, 1, 3, 4, 1, 0, 2};
        int[] array2 = array1.clone();
        printArray(array1);
        int[] result = sortArray(array1);
        printArray(result);
        int[] good = new int[array1.length];
        int[] bad = new int[array1.length];
        int goodIndex = 0;
        int badIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (array2[i] == result[i]) {
                good[goodIndex] = array2[i];
                goodIndex++;
            } else {
                bad[badIndex] = array2[i];
                badIndex++;
            }
        }
        int goodSum = sum(good);
        int badSum = sum(bad);
        System.out.println(goodSum - badSum);
        // printArray(_4_array);
    }

    private static int sum(int[] good) {
        int sum = 0;
        for (int i = 0; i < good.length; i++) {
            sum += good[i];
        }
        return sum;
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + ",");
        }
        System.out.println("\n");
    }

    private static int[] sortArray(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    // printArray(_4_array);
                }
            }
        }
        return a;
    }

}

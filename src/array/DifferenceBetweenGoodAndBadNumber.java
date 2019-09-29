package array;

public class DifferenceBetweenGoodAndBadNumber {
    public static void main(String[] args) {

        int array1[] = {0, 4, 0, 0, 1, 3, 4, 1, 0, 2};
        int array2[] = array1.clone();
        printArray(array1);
        int result[] = sortArray(array1);
        printArray(result);
        int good[] = new int[array1.length];
        int bad[] = new int[array1.length];
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


        // printArray(array);
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
        int arr1[]=a;
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp;
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    // printArray(array);
                }
            }
        }
        return arr1;
    }
}

package _4_array;

public class _10_MergeTwoSortedArray {
    //if length is different complexity o(m+n)
    //if length is same complexity o(2n)
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5, 6};
        int array2[] = {2, 2, 3, 4, 5, 7};
        int result[] = mergeArrays(array1, array2);
        for (int a : result) {
            System.out.println(a);
        }
    }

    private static int[] mergeArrays(int[] array1, int[] array2) {
        int mergedArray[] = new int[array1.length + array2.length];
        int left = 0;
        int right = 0;
        int k = 0;
        while (left < array1.length && right < array2.length) {
            if (array1[left] < array2[right]) {
                mergedArray[k] = array1[left];
                left++;
            } else {
                mergedArray[k] = array2[right];
                right++;
            }
            k++;
        }
        while (left < array1.length) {
            mergedArray[k] = array1[left];
            left++;
            k++;
        }
        while (right < array2.length) {
            mergedArray[k] = array2[right];
            right++;
            k++;
        }
        return mergedArray;
    }
}

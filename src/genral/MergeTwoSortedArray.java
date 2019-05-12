package genral;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 4, 5, 5, 9, 9};
        int array2[] = {5, 6, 6, 7, 8, 8, 8, 9, 9};
        int mergedArray[] = merge(array1, array2);
        int distinctArray[] = removeDuplicate(mergedArray);
        for (int i : distinctArray
                ) {
            System.out.println(i);

        }
    }

    private static int[] removeDuplicate(int[] resultArray) {

        if (resultArray.length < 2) {
            return resultArray;
        }
        int i = 1;
        int j = 0;
        while (i < resultArray.length) {
            if (resultArray[i] == resultArray[j]) {
                i++;
            } else {
                j++;
                resultArray[j] = resultArray[i];
                i++;
            }
        }
        int newArray[] = new int[j + 1];
        for (int k = 0; k < newArray.length; k++) {
            newArray[k] = resultArray[k];
        }
        return newArray;
    }

    private static int[] merge(int[] array1, int[] array2) {
        int result[] = new int[array1.length + array2.length];
        int left = 0;
        int right = 0;
        int k = 0;
        while (left < array1.length && right < array2.length) {
            if (array1[left] < array2[right]) {
                result[k] = array1[left];
                left++;
            } else {
                result[k] = array2[right];
                right++;
            }
            k++;
        }
        while (left < array1.length) {
            result[k] = array1[left];
            left++;
            k++;
        }
        while (right < array2.length) {
            result[k] = array2[right];
            right++;
            k++;
        }
        return result;
    }

}

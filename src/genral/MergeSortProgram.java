package genral;

public class MergeSortProgram {
    public static void main(String[] args) {
        int array[] = {2, 1, 4, 3, 5, 6, 8, 7, 9};
        devideArray(array, 0, array.length - 1);
        printArray(array);
    }

    private static void devideArray(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            devideArray(array, low, mid);
            devideArray(array, mid + 1, high);
            mergeArray(array, low, mid, high);

        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    private static void mergeArray(int[] array, int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= high) {
            if (array[left] < array[right]) {
                temp[k] = array[left];
                left++;
            } else {
                temp[k] = array[right];
                right++;

            }
            k++;
        }
        while (left <= mid) {
            temp[k] = array[left];
            left++;
            k++;
        }
        while (right <= high) {
            temp[k] = array[right];
            right++;
            k++;
        }

        for (int i = 0; i < temp.length; i++) {
            array[low + i] = temp[i];
        }
    }


}

package _4_array;

public class _15_SearchInsertElementInArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 5};
        int position = searchInsertElementPosition(array, 2);
        System.out.println(position);
    }

    private static int searchInsertElementPosition(int[] array, int element) {
        if (element < array[0]) {
            return 0;
        } else if (element > array[array.length - 1]) {
            return array.length;
        }
        for (int i = 0; i <array.length; i++) {
            if (array[i]==element){
               return i;
            }else if (array[i]<element&&element<array[i+1]){
                return i+1;
            }

        }
        return -1;

    }
}

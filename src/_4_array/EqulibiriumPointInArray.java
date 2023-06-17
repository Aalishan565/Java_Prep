package _4_array;

public class EqulibiriumPointInArray {

    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 0, 7};
        System.out.println(findEqulibirium(arr));
    }

    private static int findEqulibirium(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sum = 0;
        int maxsumsofar = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
            if (sum == maxsumsofar) {
                return i;
            }
            maxsumsofar = maxsumsofar + arr[i];
        }
        return -1;
    }

}

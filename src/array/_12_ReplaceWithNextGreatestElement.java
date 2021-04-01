package array;

public class _12_ReplaceWithNextGreatestElement {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 1, 0, 4, 1,0, 1, 2};
        int max = arr[arr.length-1];
        int length = arr.length - 1;
        for (int i = length -1; i >= 0; i--) {
            if (max >= arr[i]) {
                arr[i] = max;
            } else {
                max = arr[i];
            }
        }
        for (int a : arr) {
            System.out.println(a);
        }

    }


}

package _4_array;

public class _24_RainWaterTrapping {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4, 0, 1, 3, 2};
        int answer = waterTrapping(array);
        System.out.println(answer);
    }

    private static int waterTrapping(int[] array) {
        int length = array.length;
        int[] leftArray = new int[length];
        int[] rightArray = new int[length];
        leftArray[0] = array[0];
        rightArray[length - 1] = array[length - 1];
        for (int i = 1; i < length; i++) {
            leftArray[i] = Math.max(leftArray[i - 1], array[i]);
        }
        for (int i = length - 2; i >= 0; i--) {
            rightArray[i] = Math.max(rightArray[i + 1], array[i]);
        }
        int ans = 0;
        for (int i = 0; i < length; i++) {
            ans += Math.min(leftArray[i], rightArray[i]) - array[i];
        }
        return ans;
    }

}

package _6_searching;

public class _8_BinarySearchMissingNumberInLogN {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 6};
        System.out.println(findMissingElementInSortedArray(array));
    }

    //Binary missing element in logN
    static int findMissingElementInSortedArray(int array[]) {
        int startIndex = 0, endIndex = array.length - 1;
        int mid;
        while ((endIndex - startIndex) > 1) {
            mid = (startIndex + endIndex) / 2;
            if ((array[startIndex] - startIndex) != (array[mid] - mid)) {
                endIndex = mid;
            } else if ((array[endIndex] - endIndex) != (array[mid] - mid)) {
                startIndex = mid;
            } else {
                return -1;
            }
        }
        return (array[startIndex] + 1);
    }

}
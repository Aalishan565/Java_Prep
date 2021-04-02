package array;

public class _2_SecondLargestInArray {

    public static void main(String[] args) {
        int array[] = {1, 5, 3, 7, 8, 9, 8, 7, 7};
        int largest = array[0];
        int secondLargest = largest;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];

            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}

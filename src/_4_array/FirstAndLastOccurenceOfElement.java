package _4_array;

public class FirstAndLastOccurenceOfElement {
    public static void main(String[] args) {
        int array[] = {1, 2, 2, 2, 2, 6, 7, 8, 9, 10};
        int x = 2;
        findFirstAndLast(array, 2);
    }

    public static void findFirstAndLast(int arr[], int x) {
        int n = arr.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i]) {
                continue;
                //Skip next iteration
            }
            if (first == -1) {
                first = i;
            }
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        } else
            System.out.println("Not Found");
    }
}

package _4_array;

public class FindSingleElementInArrayWhileOthersAreRepeated {
    public static void main(String[] args) {
        int array1[] = {1, 2, 1, 2, 4, 5, 4};
        int res = array1[0];
        for (int i = 1; i < array1.length; i++) {
            res = res ^ array1[i];
        }
        System.out.println(res);
    }
}

package _4_array;

import java.util.HashSet;

public class _19_FirstRepeatedElementInArray {

    public static void main(String[] args) {
        int array1[] = {7, 2, 1, 2, 4, 5, 4};
        HashSet<Integer> hashSet = new HashSet<>();
        int position = -1;
        for (int i = array1.length - 1; i >= 0; i--) {
            if (hashSet.contains(array1[i])) {
                position = i;
            } else {
                hashSet.add(array1[i]);
            }
        }
        System.out.println(array1[position]);
    }

}

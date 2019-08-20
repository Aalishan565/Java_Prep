package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionArrays {
    public static void main(String[] args) {
        Integer array1[] = {1, 3, 5, 7, 9};
        Integer array2[] = {1, 2, 3, 4, 5};
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(array1));
        hashSet.retainAll(Arrays.asList(array2));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

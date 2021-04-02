package array;

import java.util.*;

public class _9_IntersectionArrays {
    public static void main(String[] args) {
        Integer array1[] = {1, 3, 3, 5, 7, 9};
        Integer array2[] = {1, 2, 3, 3, 4, 4, 5};
        Iterator iterator = getInterSectionUsingMap(array1, array2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // getInterSectionUsingMap(array1,array2);
    }

    private static Iterator getInterSection(Integer[] array1, Integer[] array2) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(array1));
        hashSet.retainAll(Arrays.asList(array2));
        return hashSet.iterator();
    }

    private static Iterator getInterSectionUsingMap(Integer[] array1, Integer[] array2) {
        int length1 = array1.length;
        int length2 = array1.length;
        Set<Integer> s = new HashSet();
        HashMap<Integer, Integer> hm = new HashMap<>();
        if (length1 > length2) {
            for (int a : array1
                    ) {
                hm.put(a, 1);

            }
            for (int a : array2
                    ) {
                if (hm.containsKey(a)) {
                    s.add(a);
                }

            }
        } else {
            for (int a : array2
                    ) {
                hm.put(a, 1);

            }
            for (int a : array1
                    ) {
                if (hm.containsKey(a)) {
                    s.add(a);
                }
            }


        }
        return s.iterator();

    }

}
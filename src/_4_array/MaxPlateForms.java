package _4_array;

import java.util.Arrays;

public class MaxPlateForms {
    public static void main(String[] args) {
        int arrival[] = {1, 3, 4, 7, 8};
        int departure[] = {2, 5, 6, 7, 9};
        int max_count = 0;
        int count = 0;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        for (int i = 0, j = 0; i < arrival.length; ) {
            if (arrival[i] < departure[j]) {
                count++;
                i++;
                if (count > max_count) {
                    max_count = count;
                }
            } else {
                count--;
                j++;
            }
        }
        System.out.println(max_count + " Plate form need to pass given timing trains.");
    }
}

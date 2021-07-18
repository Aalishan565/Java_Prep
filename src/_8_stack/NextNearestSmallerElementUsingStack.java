package _8_stack;

import java.util.Arrays;
import java.util.Collection;

public class NextNearestSmallerElementUsingStack {

    public static void main(String[] args) {
        int array[] = {3, 1, 2, 4};
        int result[] = findPreviousSmallerElements(array);
        for (int a : result) {
            System.out.println(a);
        }
    }

    private static int[] findPreviousSmallerElements(int[] array) {
        int auxArray[] = new int[array.length];
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        auxArray[0] = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= array[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                auxArray[i] = -1;
            } else {
                auxArray[i] = stack.peek();
            }
            stack.push(array[i]);
        }
        return auxArray;
    }

}

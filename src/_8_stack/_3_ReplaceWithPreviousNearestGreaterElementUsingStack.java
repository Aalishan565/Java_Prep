package _8_stack;

public class _3_ReplaceWithPreviousNearestGreaterElementUsingStack {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4};
        int[] result = findPreviousGreaterElements(array);
        for (int a : result) {
            System.out.println(a);
        }
    }

    private static int[] findPreviousGreaterElements(int[] array) {
        int[] auxArray = new int[array.length];
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        auxArray[0] = -1;
        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= array[i]) {
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

package _8_stack;

public class _3_ReplaceWithNextNearestGreaterElementUsingStack {

    public static void main(String[] args) {
        int array[] = {3, 1, 2, 4, 0, 1, 3, 2};
        int result[] = findNextGreaterElements(array);
        for (int a : result) {
            System.out.println(a);
        }
    }

    private static int[] findNextGreaterElements(int[] array) {
        int auxArray[] = new int[array.length];
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        auxArray[array.length - 1] = -1;
        for (int i = array.length - 2; i >= 0; i--) {
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

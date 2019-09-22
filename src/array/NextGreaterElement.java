package array;

public class NextGreaterElement {
    public static void main(String[] args) {
        int array[] = {4, 8, 5, 2, 13, 25, 12, 7};
        // usingLoop(array);
        usingStack(array);
    }

    private static void usingLoop(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    System.out.println(array[i] + "-->" + array[j]);
                    break;
                }

            }


        }
    }

    private static void usingStack(int[] array) {
        java.util.Stack<Integer> stack = new java.util.Stack();
        for (int i = 0; i < array.length; i++) {
            while (!stack.isEmpty() && stack.peek() < array[i]) {
                System.out.println(stack.pop() + " " + array[i]);
            }
            stack.push(array[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " No next greater elements");
        }
    }
}


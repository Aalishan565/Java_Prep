package stack;

import java.util.Stack;

public class GetMinInOrderOf1 {
    static Stack<Integer> stackMain = new Stack();
    static Stack<Integer> stackAux = new Stack();

    public static void main(String[] args) {

        addToStack(3);
        addToStack(4);
        addToStack(1);
        addToStack(5);
        int element = getMinFromStack();
        System.out.println(element);


    }

    private static void addToStack(int i) {
        stackMain.add(i);
        if (stackAux.isEmpty()) {
            stackAux.add(i);
        } else if (stackAux.peek() > i) {
            stackAux.add(i);
        }

    }

    private static int getMinFromStack() {
        return stackAux.peek();
    }


}

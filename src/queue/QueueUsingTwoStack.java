package queue;


import java.util.Stack;

public class QueueUsingTwoStack {
    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public static void main(String[] args) {
        QueueUsingTwoStack queueUsingTwoStack = new QueueUsingTwoStack();
        queueUsingTwoStack.enque(2);
        queueUsingTwoStack.enque(3);
        queueUsingTwoStack.enque(4);
        System.out.println("Size of the queue " + queueUsingTwoStack.getSizeofQueue());
        System.out.println("Check if que is empty or not " + queueUsingTwoStack.isEmpty());
        System.out.println("Deque the element " + queueUsingTwoStack.deque());
        System.out.println("Deque the element " + queueUsingTwoStack.deque());
        queueUsingTwoStack.enque(5);
        queueUsingTwoStack.enque(6);
        System.out.println("Size of the queue " + queueUsingTwoStack.getSizeofQueue());
        System.out.println("Check if que is empty or not " + queueUsingTwoStack.isEmpty());
    }

    public void enque(int data) {
        stack1.push(data);
    }

    public int deque() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int getSizeofQueue() {
        return stack1.size() + stack2.size();
    }

    boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

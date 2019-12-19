package stack;

public class Stack {

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.push(10);
        listNode.push(12);
        listNode.push(15);
        listNode.push(17);
        listNode.printStack();
        listNode.pop();
        listNode.pop();
        listNode.pop();
        listNode.printStack();

    }

    static class ListNode {
        int length;
        int data;
        ListNode top;
        ListNode next;

        public ListNode() {

        }

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        void push(int data) {
            System.out.println("push() " + data);
            ListNode temp = new ListNode(data);
            temp.next = top;
            top = temp;
            length++;
            System.out.println("push() Top element: " + top.data);
            System.out.println("push() Length: " + length);
        }

        public void pop() {
            System.out.println("pop()");
            if (isEmpty()) {
                System.out.println("pop() Empty stack");
                return;
            }
            top = top.next;
            length--;
            System.out.println("pop() Top element " + top.data);
            System.out.println("pop() Length " + length);
        }

        public ListNode peek() {
            System.out.println("peek() " + top);
            return top;
        }

        boolean isEmpty() {
            System.out.println("isEmpty() " + (length == 0));
            return length == 0;
        }

        private void printStack() {
            System.out.println("printStack()");
            if (isEmpty()) {
                System.out.println("no element are in the stack..");
            }
            ListNode temp = top;
            while (temp != null) {
                System.out.println("Elements: " + temp.data);
                temp = temp.next;
            }
        }
    }
}

package stack;

public class Stack {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.push(10);
        listNode.push(12);
        listNode.push(15);
        listNode.push(17);
        // listNode.PrintStack();
        listNode.pop();
        listNode.pop();
        listNode.pop();
        listNode.PrintStack();

    }

    static class ListNode {
        int length;
        int data;
        ListNode top;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public ListNode() {

        }

        void push(int data) {
            ListNode temp = new ListNode(data);
            temp.next = top;
            top = temp;
            length++;
        }

        boolean isEmpty() {
            return length == 0;
        }

        void PrintStack() {
            if (isEmpty()) {
                System.out.println("no element are in the stack..");
            }
            ListNode temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }

        public void pop() {
            if (isEmpty()) {
                return;
            }
            top = top.next;
            length--;

        }

        public ListNode peek() {
            return top;
        }
    }
}

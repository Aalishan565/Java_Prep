package queue;


public class Queue {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.insertInQueue(21);
        listNode.insertInQueue(22);
        listNode.insertInQueue(23);
        listNode.deQueue();
        listNode.printQueue();
    }

    private static class ListNode {
        ListNode front;
        ListNode rear;
        int length;
        int data;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        boolean isEmpty() {
            return length == 0;
        }

        void insertInQueue(int data) {
            ListNode temp = new ListNode(data);
            if (isEmpty()) {
                front = temp;
                rear = temp;
            } else {
                rear.next = temp;
                rear = temp;
            }
            length++;

        }

        void deQueue() {
            if (isEmpty()) {
                throw new NullPointerException();
            } else {
                front = front.next;
                length--;
            }

        }

        void printQueue() {
            if (isEmpty()) {
                System.out.println("no element are in the stack..");
            }
            ListNode temp = front;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }

    }

}

package _9_queue;


import java.util.NoSuchElementException;

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

        public ListNode() { }

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
                System.out.println("isEmpty() Insert in _9_queue " + temp.data);
                front = temp;
                rear = temp;
            } else {
                rear.next = temp;
                rear = temp;
                System.out.println("Insert in _9_queue rear: " + rear.data);
            }
            length++;
        }

        void deQueue() {
            if (isEmpty()) {
                throw new NoSuchElementException();
            } else {
                System.out.println("deQueue() front : " + front.data);
                front = front.next;
                length--;
            }
        }

        void printQueue() {
            if (isEmpty()) {
                System.out.println("no element are in the _9_queue..");
            }
            ListNode temp = front;
            while (temp != null) {
                System.out.println("Queue elements: " + temp.data);
                temp = temp.next;
            }
        }
    }
}

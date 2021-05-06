package _7_linked_list;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class ListNode {
        ListNode next;
        int data;

        public ListNode(int data) {
            this.data = data;
        }

    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    int getLength() {
        return length;
    }

    boolean isEmpty() {
        return length == 0;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        // cll.createList();
        // cll.insertNodeAtBegining(18);
        // cll.insertNodeAtBegining(128);
        cll.insertNodeAtEnd(23);
        cll.insertNodeAtEnd(24);
        cll.removeFirstNode();
        cll.printList();

    }

    void createList() {
        ListNode first = new ListNode(12);
        ListNode second = new ListNode(13);
        ListNode third = new ListNode(14);
        ListNode fourth = new ListNode(15);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
    }

    void printList() {
        if (last == null) {
            return;
        } else {
            ListNode first = last.next;
            while (first != last) {
                System.out.println(first.data);
                first = first.next;
            }
            System.out.println(first.data);
        }

    }

    void insertNodeAtBegining(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    void insertNodeAtEnd(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    void removeFirstNode() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if (last.next == last) {
            last = null;

        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
    }
}

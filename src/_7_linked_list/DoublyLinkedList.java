package _7_linked_list;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    class ListNode {
        int data;
        ListNode next;
        ListNode previous;

        ListNode(int data) {
            this.data = data;
        }
    }


    DoublyLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertNodeAtBeginning(3);
        doublyLinkedList.insertNodeAtBeginning(2);
        doublyLinkedList.deleteHead();
        doublyLinkedList.displayForward();
        // doublyLinkedList.displayBackward();

    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    public void insertNodeAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertNodeAtLast(int value) {
        ListNode newNode = new ListNode(value);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
    }

    public void displayForward() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void displayBackward() {
        if (tail == null) {
            return;
        }
        ListNode current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.previous;
        }
    }

    public ListNode deleteHead() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteTail() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        return temp;
    }
}

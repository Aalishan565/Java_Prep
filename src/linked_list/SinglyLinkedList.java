package linked_list;


import com.sun.istack.internal.NotNull;


public class SinglyLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        ListNode fifth = new ListNode(7);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        //fourth.next=third;

        //printing the linked list
        // printLinkedList(head);

        //finding the length of linked list
        //int length=getLinkedListLength(head);
        //System.out.println(length);

        //insert Element at beginning
        // DoublyLinkedList newHead = insertElementAtBeginning(head, 6);
        // printLinkedList(newHead);

        //insert Element at last
        //  DoublyLinkedList newList = insertAtLast(head, 9);
        //printLinkedList(newList);

        //add node after given node
        //insertNodeAfterGivenNode(third, 8);
        //printLinkedList(head);

        //insert node at given position
        //insertNodeAtGivenPosition(head, 3, 1);
        //printLinkedList(head);

        //delete the head node
        //DoublyLinkedList newList = deleteHead(head);
        //printLinkedList(newList);

        //delete last node
        //DoublyLinkedList newList = deleteLastNode(head);
        //printLinkedList(newList);

        //detect loop in linked list
        // boolean isLoopExist = isLoopExist(head);
        // System.out.println(isLoopExist);

        //find the middle element of linkedlist
        //DoublyLinkedList middleElement = middleElement(head);
        //System.out.println(middleElement.data);

        //reverse linked list
        // DoublyLinkedList newList = reverserList(head);
        // printLinkedList(newList);

        //find the nth element from last in linked list
        //  ListNode element = findTheElement(head, 1);
        //  System.out.println(element.data);
        ListNode reverseList = reverserListUsingRecursion(head);
        printLinkedList(reverseList);
    }

    private static ListNode findTheElement(ListNode head, int position) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        for (int i = 0; i < position; i++) {
            fastPointer = fastPointer.next;
        }
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }

    private static ListNode reverserList(ListNode head) {
        ListNode current = head;
        ListNode nextNode = head;
        ListNode previous = null;
        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    private static ListNode reverserListUsingRecursion(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode reverseNode = reverserListUsingRecursion(node.next);
        node.next.next = node;
        node.next = null;
        return reverseNode;
    }

    private static ListNode middleElement(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }

    private static boolean isLoopExist(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }

    private static ListNode deleteLastNode(ListNode head) {
        ListNode last = head;
        ListNode previousToLast = null;
        while (last.next != null) {
            previousToLast = last;
            last = last.next;
        }
        previousToLast.next = null;

        return head;
    }

    private static ListNode deleteHead(ListNode head) {
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    private static void insertNodeAtGivenPosition(ListNode head, int position, int data) {
        ListNode newNode = new ListNode(data);
        int count = 1;
        ListNode previous = head;
        while (count < position - 1) {
            count++;
            previous = previous.next;
        }
        ListNode current = previous.next;
        newNode.next = current;
        previous.next = newNode;
    }

    private static void insertNodeAfterGivenNode(@NotNull ListNode previous, int i) {
        ListNode newNode = new ListNode(i);
        newNode.next = previous.next;
        previous.next = newNode;
    }

    private static ListNode insertAtLast(ListNode head, int element) {
        ListNode current = head;
        ListNode newElement = new ListNode(element);
        while (current.next != null) {
            current = current.next;
        }
        current.next = newElement;
        return head;
    }

    private static ListNode insertElementAtBeginning(ListNode head, int element) {
        ListNode newNode = new ListNode(element);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static int getLinkedListLength(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;

    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }


    }
}

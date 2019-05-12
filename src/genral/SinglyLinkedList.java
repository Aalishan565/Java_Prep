package genral;


import java.util.List;

public class SinglyLinkedList {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        //lenghtOfList(head);
        // ListNode newHead = insertNodeAtBeginning(head, 7);
        //  ListNode newList=insertAtLast(head,9);
        //   insertAfterGivenNode(third,7);
        // insertNodeAtGivenPosition(head,2,9);
        //ListNode newList = deleteHead(head);
        // ListNode newList = deleteLastNode(head);
        // System.out.println(loopExistInLinkedList(head));
        //ListNode node = nthNodeFromLast(head, 1);
        //System.out.println(node.data);
       ListNode newList= reverseLinkedList(head);
         printList(newList);

    }

    private static ListNode reverseLinkedList(ListNode currentNode) {
    ListNode previousNode=null;
    ListNode nextNode;
    while (currentNode!=null){
        nextNode=currentNode.next;
        currentNode.next=previousNode;
        previousNode=currentNode;
        currentNode=nextNode;
    }
    return previousNode;
    }

    private static ListNode nthNodeFromLast(ListNode head, int n) {
        ListNode firstPtr = head;
        ListNode secondPtr = head;
        for (int i = 0; i < n; i++) {
            firstPtr = firstPtr.next;
        }
        while (firstPtr != null) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }
        return secondPtr;
    }

    private static boolean loopExistInLinkedList(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                return true;
            }
        }

        return false;
    }

    private static ListNode deleteLastNode(ListNode head) {
        ListNode last = head;
        ListNode lastToPrevious = null;
        while (last.next != null) {
            lastToPrevious = last;
            last = last.next;
        }
        lastToPrevious.next = null;
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
        ListNode previous = head;
        int count = 0;
        while (count < position - 1) {
            count++;
            previous = previous.next;
        }
        ListNode current = previous.next;
        newNode.next = current;
        previous.next = newNode;

    }

    private static void insertAfterGivenNode(ListNode third, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = third.next;
        third.next = newNode;
    }

    private static ListNode insertAtLast(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    private static ListNode insertNodeAtBeginning(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static void lenghtOfList(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(count);
    }

    private static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

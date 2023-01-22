package _7_linked_list.singly_linked_list;

public class _5_InsertAtGivenPositionLinkedList {

    public static void insertNodeAtGivenPosition(ListNode head, int position, int data) {
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

}

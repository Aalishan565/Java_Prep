package _7_linked_list.singly_linked_list;

import _7_linked_list.ListNode;

public class _3_InsertAtLastLinkedList {

    public static ListNode insertAtLast(ListNode head, int element) {
        ListNode current = head;
        ListNode newElement = new ListNode(element);
        while (current.next != null) {
            current = current.next;
        }
        current.next = newElement;
        return head;
    }

}

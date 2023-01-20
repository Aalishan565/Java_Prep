package _7_linked_list.singly_linked_list;

import _7_linked_list.ListNode;

public class _7_DeleteLastNodeLinkedList {

    public static ListNode deleteLastNode(ListNode head) {
        ListNode last = head;
        ListNode previousToLast = null;
        while (last.next != null) {
            previousToLast = last;
            last = last.next;
        }
        previousToLast.next = null;
        return head;
    }


}

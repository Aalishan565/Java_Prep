package _7_linked_list.singly_linked_list;

import _7_linked_list.ListNode;

public class _2_LengthOfLinkedList {

    public static int getLinkedListLength(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

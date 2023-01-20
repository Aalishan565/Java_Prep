package _7_linked_list.singly_linked_list;

import _7_linked_list.ListNode;

public class _16_RemoveDuplicateFromSortedLinkedList {

    public static ListNode removeDuplicate(ListNode head) {
        ListNode current = head;
        ListNode newList = current;
        ListNode sortedHead = newList;
        while (current != null) {
            if (current.data == newList.data) {
                current = current.next;
            } else {
                newList.next = current;
                current = current.next;
                newList = newList.next;
            }
            newList.next = null;
        }
        return sortedHead;
    }

}

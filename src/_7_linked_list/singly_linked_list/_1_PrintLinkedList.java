package _7_linked_list.singly_linked_list;

import _7_linked_list.ListNode;

public class _1_PrintLinkedList {

    public static void printLinkedList(ListNode head) {
        if (null != head) {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }

    }
}

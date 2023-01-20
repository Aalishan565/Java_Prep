package _7_linked_list.singly_linked_list;

import _7_linked_list.ListNode;

public class _13_FindStartingOfLoopLinkedList {

    public static ListNode findStartingOfLoopNode(ListNode head, ListNode pointer) {
        ListNode temp = head;
        ListNode slowPointer = pointer;
        while (slowPointer != temp) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        return temp;
    }

}

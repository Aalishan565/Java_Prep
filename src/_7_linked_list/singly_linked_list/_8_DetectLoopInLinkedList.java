package _7_linked_list.singly_linked_list;

import _7_linked_list.ListNode;

public class _8_DetectLoopInLinkedList {

    public static boolean isLoopExist(ListNode head) {
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


}

package _7_linked_list.singly_linked_list;

public class _11_FindNthNodeFromLastLinkedList {

    public static ListNode findNthElement(ListNode head, int n) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        for (int i = 0; i < n; i++) {
            fastPointer = fastPointer.next;
        }
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }

}

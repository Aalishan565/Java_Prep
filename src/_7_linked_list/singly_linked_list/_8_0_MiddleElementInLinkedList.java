package _7_linked_list.singly_linked_list;

public class _8_0_MiddleElementInLinkedList {

    public static ListNode middleElement(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }

}

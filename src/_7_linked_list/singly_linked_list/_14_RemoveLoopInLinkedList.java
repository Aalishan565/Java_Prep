package _7_linked_list.singly_linked_list;

public class _14_RemoveLoopInLinkedList {

    public static void removeTheLoopOfLinkedList(ListNode head, ListNode pointer) {
        ListNode temp = head;
        ListNode slowPointer = pointer;
        while (slowPointer.next != temp.next) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = null;
    }

}

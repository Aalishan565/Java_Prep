package _7_linked_list.singly_linked_list;

public class _8_2_FindStartingOfLoopLinkedList {

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

package _7_linked_list.singly_linked_list;

public class _6_DeleteHeadLinkedList {

    public static ListNode deleteHead(ListNode head) {
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

}

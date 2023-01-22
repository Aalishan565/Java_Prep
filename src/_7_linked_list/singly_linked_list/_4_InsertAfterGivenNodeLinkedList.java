package _7_linked_list.singly_linked_list;

public class _4_InsertAfterGivenNodeLinkedList {

    public static void insertNodeAfterGivenNode(ListNode previous, int i) {
        ListNode newNode = new ListNode(i);
        newNode.next = previous.next;
        previous.next = newNode;
    }

}

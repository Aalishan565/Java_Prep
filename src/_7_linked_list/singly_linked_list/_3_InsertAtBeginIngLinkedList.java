package _7_linked_list.singly_linked_list;

public class _3_InsertAtBeginIngLinkedList {

    public static ListNode insertElementAtBeginning(ListNode head, int element) {
        ListNode newNode = new ListNode(element);
        newNode.next = head;
        head = newNode;
        return head;
    }

}

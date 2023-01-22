package _7_linked_list.singly_linked_list;

public class _17_InsertElementInSortedLinkedList {

    public static void insertElementInSortedList(ListNode head, int data) {
        ListNode listNode = new ListNode(data);
        ListNode currentNode = head;
        while (currentNode.next != null && currentNode.next.data < listNode.data) {
            currentNode = currentNode.next;
        }
        listNode.next = currentNode.next;
        currentNode.next = listNode;
    }

}

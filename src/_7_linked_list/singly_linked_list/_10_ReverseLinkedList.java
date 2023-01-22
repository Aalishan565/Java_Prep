package _7_linked_list.singly_linked_list;

public class _10_ReverseLinkedList {

    public static ListNode reverserPointers(ListNode head) {
        ListNode current = head;
        ListNode nextNode = head;
        ListNode previous = null;
        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public static void printFromEnd(ListNode head) {
        if (head == null) {
            return;
        }
        printFromEnd(head.next);
        System.out.println(head.data);
    }

    public static ListNode reverserLinkedListUsingRecursion(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode reverseNode = reverserLinkedListUsingRecursion(node.next);
        node.next.next = node;
        node.next = null;
        return reverseNode;
    }

}

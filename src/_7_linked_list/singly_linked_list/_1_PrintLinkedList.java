package _7_linked_list.singly_linked_list;

public class _1_PrintLinkedList {

    public static void printLinkedList(ListNode head) {
        if (null != head) {
            ListNode current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

    }
}

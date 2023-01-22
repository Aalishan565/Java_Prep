package _7_linked_list.singly_linked_list;

public class _16_EvenOddLinkedList {

    public static ListNode segregateEvenOddList(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode odd = node;
        ListNode even = odd.next;
        ListNode evenFirst = even;

        while (true) {
            // If there are no more nodes,
            // then connect first node of even
            // list to the last node of odd list
            if (odd == null || even == null || even.next == null) {
                odd.next = evenFirst;
                break;
            }
            // Connecting odd nodes
            odd.next = even.next;
            odd = even.next;
            // If there are NO more even nodes
            // after current odd.
            if (odd.next == null) {
                even.next = null;
                odd.next = evenFirst;
                break;
            }
            // Connecting even nodes
            even.next = odd.next;
            even = odd.next;
        }
        return node;
    }

}

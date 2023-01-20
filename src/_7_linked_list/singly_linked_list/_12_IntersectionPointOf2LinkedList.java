package _7_linked_list.singly_linked_list;

import _7_linked_list.ListNode;

public class _12_IntersectionPointOf2LinkedList {

    public static ListNode getIntersectionPoint(ListNode first, ListNode second) {
        int l1 = _2_LengthOfLinkedList.getLinkedListLength(first);
        int l2 = _2_LengthOfLinkedList.getLinkedListLength(second);
        int diff;
        if (l1 > l2) {
            diff = l1 - l2;
            for (int i = 0; i < diff; i++) {
                first = first.next;
            }
            while (first.next != null && second.next != null) {
                first = first.next;
                second = second.next;
                if (first == second) {
                    return first;
                }
            }
        } else {
            diff = l2 - l1;
            for (int i = 0; i < diff; i++) {
                first = first.next;
            }
            while (first.next != null && second.next != null) {
                first = first.next;
                second = second.next;
                if (first == second) {
                    return first;
                }
            }
        }
        return null;
    }

}

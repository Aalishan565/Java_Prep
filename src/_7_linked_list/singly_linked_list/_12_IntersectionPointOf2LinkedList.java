package _7_linked_list.singly_linked_list;

public class _12_IntersectionPointOf2LinkedList {

    public static ListNode getIntersectionPoint(ListNode firstHead, ListNode secondHead) {
        int l1 = _2_LengthOfLinkedList.getLinkedListLength(firstHead);
        int l2 = _2_LengthOfLinkedList.getLinkedListLength(secondHead);
        int diff;
        if (l1 > l2) {
            diff = l1 - l2;
            for (int i = 0; i < diff; i++) {
                firstHead = firstHead.next;
            }
        } else {
            diff = l2 - l1;
            for (int i = 0; i < diff; i++) {
                secondHead = secondHead.next;
            }
        }
        while (firstHead.next != null && secondHead.next != null) {
            firstHead = firstHead.next;
            secondHead = secondHead.next;
            if (firstHead == secondHead) {
                return firstHead;
            }
        }
        return null;
    }

}

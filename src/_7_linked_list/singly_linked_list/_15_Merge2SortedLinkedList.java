package _7_linked_list.singly_linked_list;

public class _15_Merge2SortedLinkedList {

    public static ListNode mergeTwoSortedLinkedList(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode tempHead;
        ListNode mergedList = new ListNode(-1);
        tempHead = mergedList;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                mergedList.next = l1;
                l1 = l1.next;
            } else {
                mergedList.next = l2;
                l2 = l2.next;
            }
            mergedList = mergedList.next;
        }
        if (l1 == null) {
            mergedList.next = l2;
        } else if (l2 == null) {
            mergedList.next = l1;
        }
        return tempHead.next;
    }

}

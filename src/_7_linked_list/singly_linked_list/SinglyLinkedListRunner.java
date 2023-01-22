package _7_linked_list.singly_linked_list;

public class SinglyLinkedListRunner {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);
        ListNode nine = new ListNode(9);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seven;
        seven.next = eight;
        eight.next = nine;

        //printing the linked list
        //_1_PrintLinkedList.printLinkedList(head);

        //finding the length of linked list
        //int length = _2_LengthOfLinkedList.getLinkedListLength(head);
        //System.out.println(length);

        //insert Element at beginning
        // ListNode newHead = _3_InsertAtBeginIngLinkedList.insertElementAtBeginning(head, 6);
        // printLinkedList(newHead);

        //insert Element at last
        //ListNode newList = _3_InsertAtLastLinkedList.insertAtLast(head, 9);
        //printLinkedList(newList);

        //add node after given node
        //_4_InsertAfterGivenNodeLinkedList.insertNodeAfterGivenNode(third, 8);
        //printLinkedList(head);

        //insert node at given position
        //_5_InsertAtGivenPositionLinkedList.insertNodeAtGivenPosition(head, 3, 1);
        //printLinkedList(head);

        //delete the head node
        //ListNode newList = _6_DeleteHeadLinkedList.deleteHead(head);
        //printLinkedList(newList);

        //delete last node
        //ListNode newList = _7_DeleteLastNodeLinkedList.deleteLastNode(head);
        //printLinkedList(newList);

        //detect loop in linked list
        //boolean isLoopExist = _8_DetectLoopInLinkedList.isLoopExist(head);
        // System.out.println(isLoopExist);

        //find the middle element of linked list
        //ListNode middleElement = _9_MiddleElementInLinkedList.middleElement(head);
        //System.out.println(middleElement.data);

        //reverse linked list
        // ListNode reverseList = reverserPointers(head);
        // ListNode reverseList = _10_ReverseLinkedList.reverserLinkedListUsingRecursion(head);
        // printLinkedList(newList);

        //find the nth element from last in linked list
        //ListNode element = _11_FindNthNodeFromLastLinkedList.findNthElement(head, 6);
        //  System.out.println(element.data);

        //Remove duplicate from linkedList
        //ListNode node = _16_RemoveDuplicateFromSortedLinkedList.removeDuplicate(head);
        //  printLinkedList(node);

        //Insert node in sorted LinkedList
        //_17_InsertElementInSortedLinkedList.insertElementInSortedList(head, 6);
        // printLinkedList(head);

        //Intersection point of two linkedList
        //ListNode point = _12_IntersectionPointOf2LinkedList.getIntersectionPoint(head, fourth);
        // System.out.println(point.data);

        // reverse printing linked list
        //_10_ReverseLinkedList.printFromEnd(head);

        //ListNode he = _16_EvenOddLinkedList.segregateEvenOddList(head);
        // printLinkedList(head);
    }

}

package linked_list;

public class SinglyLinkedList {

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

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
        // printLinkedList(head);

        //finding the length of linked list
        //int length=getLinkedListLength(head);
        //System.out.println(length);

        //insert Element at beginning
        // ListNode newHead = insertElementAtBeginning(head, 6);
        // printLinkedList(newHead);

        //insert Element at last
        //ListNode newList = insertAtLast(head, 9);
        //printLinkedList(newList);

        //add node after given node
        //insertNodeAfterGivenNode(third, 8);
        //printLinkedList(head);

        //insert node at given position
        //insertNodeAtGivenPosition(head, 3, 1);
        //printLinkedList(head);

        //delete the head node
        // ListNode newList = deleteHead(head);
        //printLinkedList(newList);

        //delete last node
        // ListNode newList = deleteLastNode(head);
        //printLinkedList(newList);

        //detect loop in linked list
        // boolean isLoopExist = isLoopExist(head);
        // System.out.println(isLoopExist);

        //find the middle element of linkedlist
        // ListNode middleElement = middleElement(head);
        //System.out.println(middleElement.data);

        //reverse linked list
        // ListNode reverseList = reverserList(head);
        //  ListNode reverseList = reverserListUsingRecursion(head);
        // printLinkedList(newList);

        //find the nth element from last in linked list
        //  ListNode element = findNthElement(head, 6);
        //  System.out.println(element.data);

        //Remove duplicate from linkedList
        //  ListNode node = removeDuplicate(head);
        //  printLinkedList(node);

        //Insert node in sorted LinkedList
        //insertElementInSortedList(head, 6);
        // printLinkedList(head);

        //Intersection point of two linkedList
        //  ListNode point = getIntersectionPoint(head, fourth);
        // System.out.println(point.data);

        // reverse printing linked list
        // printFromEnd(head);

        ListNode he = segrigateListEvenOdd(head);
        printLinkedList(he);
    }

    private static ListNode segrigateListEvenOdd(ListNode node) {
        if (node == null) {
            return node;
        }
        ListNode odd = node;
        ListNode even = odd.next;
        ListNode evenFirst = even;

        while (1 == 1) {
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

    private static void printFromEnd(ListNode head) {
        if (head == null) {
            return;
        }
        printFromEnd(head.next);
        System.out.println(head.data);
    }

    private static ListNode getIntersectionPoint(ListNode first, ListNode second) {
        int l1 = getLinkedListLength(first);
        int l2 = getLinkedListLength(second);
        int diff = 0;
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

    private static void insertElementInSortedList(ListNode head, int data) {
        ListNode listNode = new ListNode(data);
        ListNode currentNode = head;
        while (currentNode.next != null && currentNode.next.data < listNode.data) {
            currentNode = currentNode.next;
        }
        listNode.next = currentNode.next;
        currentNode.next = listNode;
    }

    private static ListNode removeDuplicate(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;

    }

    private static ListNode findNthElement(ListNode head, int position) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        for (int i = 0; i < position; i++) {
            fastPointer = fastPointer.next;
        }
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }

    private static ListNode reverserList(ListNode head) {
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

    private static ListNode reverserListUsingRecursion(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode reverseNode = reverserListUsingRecursion(node.next);
        node.next.next = node;
        node.next = null;
        return reverseNode;
    }

    private static ListNode middleElement(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }

    private static boolean isLoopExist(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }

    private static ListNode findStartingOfLoopNode(ListNode head, ListNode pointer) {
        ListNode temp = head;
        ListNode slowPointer = pointer;
        while (slowPointer != temp) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        return temp;
    }

    private static void removeTheLoopOfLinkedList(ListNode head, ListNode pointer) {
        ListNode temp = head;
        ListNode slowPointer = pointer;
        while (slowPointer.next != temp.next) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = null;
    }

    private static ListNode deleteLastNode(ListNode head) {
        ListNode last = head;
        ListNode previousToLast = null;
        while (last.next != null) {
            previousToLast = last;
            last = last.next;
        }
        previousToLast.next = null;

        return head;
    }

    private static ListNode deleteHead(ListNode head) {
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    private static void insertNodeAtGivenPosition(ListNode head, int position, int data) {
        ListNode newNode = new ListNode(data);
        int count = 1;
        ListNode previous = head;
        while (count < position - 1) {
            count++;
            previous = previous.next;
        }
        ListNode current = previous.next;
        newNode.next = current;
        previous.next = newNode;
    }

    private static void insertNodeAfterGivenNode(ListNode previous, int i) {
        ListNode newNode = new ListNode(i);
        newNode.next = previous.next;
        previous.next = newNode;
    }

    private static ListNode insertAtLast(ListNode head, int element) {
        ListNode current = head;
        ListNode newElement = new ListNode(element);
        while (current.next != null) {
            current = current.next;
        }
        current.next = newElement;
        return head;
    }

    private static ListNode insertElementAtBeginning(ListNode head, int element) {
        ListNode newNode = new ListNode(element);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static int getLinkedListLength(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;

    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}

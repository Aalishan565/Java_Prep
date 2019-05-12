package genral;

import java.util.ArrayList;
import java.util.List;

abstract class A {
    static void dat() {

    }
}

public class Sample {

public  static void m1(int position){
    if (position>a.size()-1){
        return;
    }
    System.out.println(a.get(position));
    m1(position+1);

}

   static ArrayList a= new ArrayList();
    public static void main(String[] args) {

       /* ListNode head = new ListNode(10);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(2);
        head.next = second;
        second.next = third;
        third.next = fourth;

        //findLength(head);
       ListNode head1= insertAtBegin(head, 9);
       ListNode head2= insertAtLast(head, 24);
        printList(head2);*/


    }

    private static class ListNode {
        private ListNode next;
        private int data;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private static ListNode insertAtLast(ListNode head, int i) {
        ListNode newNode = new ListNode(i);
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    private static ListNode insertAtBegin(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static void findLength(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(count);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}



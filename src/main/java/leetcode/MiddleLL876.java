package leetcode;

import practice.ListNode;

public class MiddleLL876 {
    public static void main(String[] args) {

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println(middleNode(head).val);
    }
    public static ListNode middleNode(ListNode head) {

        if(head == null)
            return null;
        ListNode nrmlPointer = head;
        ListNode fastPointer = head;

        while (fastPointer.next!=null){
           fastPointer = fastPointer.next;
           if(fastPointer.next!=null)
               fastPointer = fastPointer.next;

           nrmlPointer = nrmlPointer.next;
        }
        return nrmlPointer;
    }
}

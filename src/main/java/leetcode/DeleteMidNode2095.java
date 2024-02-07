package leetcode;

import practice.ListNode;

import java.util.List;

public class DeleteMidNode2095 {

    public static void main(String[] args) {
        //1,3,4,7,1,2,6
        ListNode nd = deleteMiddle(new ListNode(1, new ListNode(3,
                new ListNode(4,
                        new ListNode(7,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(6))))))));

        System.out.println(nd);

    }

    public static ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next ==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while (fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = prev.next.next;
        return head;
    }
}

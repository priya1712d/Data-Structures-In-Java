package leetcode.ll;

import utilityClasses.ListNode;

import java.util.List;

public class Middlell876 {

    public static void main(String[] args) {
        ListNode ll = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println(middleNode(ll).val);
    }

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

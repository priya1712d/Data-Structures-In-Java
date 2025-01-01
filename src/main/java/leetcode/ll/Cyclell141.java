package leetcode.ll;

import utilityClasses.ListNode;

public class Cyclell141 {

    public static void main(String[] args) {
        ListNode ll = new ListNode(3);
        ListNode ll2 = new ListNode(2);
        ListNode ll3 = new ListNode(0);
        ListNode ll4 = new ListNode(-4);

        ll.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        ll4.next = ll2;

        System.out.println(hasCycle(ll));
    }

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
}

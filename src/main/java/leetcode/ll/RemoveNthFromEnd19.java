package leetcode.ll;

import utilityClasses.ListNode;

public class RemoveNthFromEnd19 {

    public static void main(String[] args) {
        ListNode ll = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        ListNode temp = removeNthFromEnd(ll, 2);
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int len = 0;

        ListNode temp = head;
        while (temp!=null){
            len++;
            temp = temp.next;
        }
        temp = head;

        int diff = len - n;
        if(diff == 0)
            return head.next;
        while(diff > 1 && temp.next!=null){
           diff--;
           temp = temp.next;
        }
        temp.next = temp.next!=null? temp.next.next: null;
        return head;
    }
}

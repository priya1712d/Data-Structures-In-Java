package leetcode.ll;

import utilityClasses.ListNode;

public class EvenOdd328 {
    public static void main(String[] args) {

        ListNode ll = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        ListNode temp = oddEvenList(ll);
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenTemp = head.next;
        //1,2,3,4,5,6
        //1,3,5
        //2,4,null
        while (even!=null && odd!=null && even.next!=null && odd.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            if(odd.next!=null)
                odd = odd.next;

            even = even.next;
        }

        odd.next = evenTemp;
        return head;
    }
}

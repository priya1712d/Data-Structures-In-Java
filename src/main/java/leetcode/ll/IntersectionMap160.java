package leetcode.ll;

import utilityClasses.ListNode;

import java.util.HashSet;

public class IntersectionMap160 {

    public static void main(String[] args) {

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode b1 = new ListNode(91);
        ListNode b2 = new ListNode(92);
        ListNode b3 = new ListNode(93);
        ListNode c1 = new ListNode(61);
        ListNode c2 = new ListNode(62);



        a1.next = a2;
        a2.next = c1;
        c1.next = c2;

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        System.out.println(getIntersectionNode(a1, b1).val);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1!=null){
            hashSet.add(temp1);
            temp1 = temp1.next;
        }

        while(temp2!=null && hashSet.add(temp2)){
            temp2 = temp2.next;
        }

        return temp2;
    }
}

package leetcode.ll;

import utilityClasses.ListNode;

public class IntersectionLen160 {

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

        int lenA = 0;
        int lenB = 0;

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=null){
            lenA++;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            lenB++;
            temp2 = temp2.next;
        }
        int diff = Math.abs(lenA-lenB);

         temp1 = headA;
         temp2 = headB;
        if(lenA>lenB){
            while(diff>0){
                temp1 = temp1.next;
                diff--;
            }
        } else if(lenB>lenA){
            while(diff>0){
                temp2 = temp2.next;
                diff--;
            }
        }

        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }
}

package leetcode.ll;

import utilityClasses.ListNode;

import java.util.List;

public class Sort148 {

    public static void main(String[] args) {
        ListNode ll = new ListNode(1, new ListNode(3,
                new ListNode(6, new ListNode(4, new ListNode(2, null)))));
        sortList(ll);

        ListNode temp = ll;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode sortList(ListNode head) {
        //find the middle
        if(head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;
        ListNode leftSorted =  sortList(head);
        ListNode rightSorted =  sortList(mid);

        return mergeLists(leftSorted, rightSorted);
    }

    private static ListNode mergeLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(l1!=null && l2!=null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = l1!=null ? l1:l2;
        return dummy.next;
       }
    }


package leetcode;

import practice.ListNode;

import java.util.List;

public class RemoveNthNodeEnd19 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1,
//                new ListNode(2, new ListNode(3,
//                        new ListNode(4, new ListNode(5, null)))));


        ListNode head = new ListNode(1, null);
//        removeNthFromEnd(head, 2);
        head = removeNthFromEnd(head, 1);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        ListNode prev = head;
        if(head == null){
            return null;
        }
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        if(n > len){
            return head;
        } else if(len-n == 0) {
            return head = head.next;
        } else {
                temp = head;
                for(int i=0;i<len-n;i++){
                    prev = temp;
                    temp = temp.next;
                }
                if(temp!=null)
                    prev.next = temp.next;
                else{
                    prev.next = null;
                }
            }
        return head;
    }
}

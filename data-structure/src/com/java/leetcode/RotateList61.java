package com.java.leetcode;

import com.java.ListNode;

public class RotateList61 {

    public static void main(String[] args) {
        ListNode node = new ListNode(0,
                new ListNode(1,
                        new ListNode(2, null)));

        ListNode rotated = rotateRight(node, 1);
        while (rotated != null) {
            System.out.println(rotated.val);
            rotated = rotated.next;
        }
    }

    // 1 -> 2-> 3-> 4-> 5
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode temp, prev;
        ListNode newHeadForLength = head;
        int index = 0;
        int length = 0;

        while (newHeadForLength != null) {
            length++;
            newHeadForLength = newHeadForLength.next;
        }

        k = (k % length);

        while (index < k) {
            temp = head;
            prev = null;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            temp.next = head;
            head = temp;
            prev.next = null;
            index++;
        }
        return head;
    }

}

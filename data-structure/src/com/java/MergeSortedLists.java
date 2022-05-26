package com.java;

public class MergeSortedLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(3, null));
        ListNode node2 = new ListNode(2, new ListNode(4, null));

        ListNode headNode = mergeTwoLists(node1, node2);
        while(headNode!=null) {
            System.out.println(headNode.val);
            headNode = headNode.next;
        }

    }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1==null){
                return list2;
            } else if(list2==null){
                return list1;
            } else {
                ListNode headNode = null;
                while(list1!=null || list2!=null) {
                    if(list1!=null && list2!=null &&  list1.val <= list2.val){
                        headNode = addToList(headNode, list1.val);
                        list1 = list1.next;
                    } else if(list1!=null && list2!=null){
                        headNode = addToList(headNode, list2.val);
                        list2 = list2.next;
                    } else if (list1 == null) {
                        headNode = addToList(headNode,list2.val);
                        list2 = list2.next;
                    } else {
                        headNode = addToList(headNode,list1.val);
                        list1 = list1.next;
                    }

                }
                return headNode;
            }

        }

        public static ListNode addToList(ListNode headNode, int val){
           ListNode tempNode = headNode;
            if (headNode == null) {
                headNode = new ListNode(val, null);
            } else {
                while(tempNode.next!=null) {
                    tempNode = tempNode.next;
                }
                tempNode.next = new ListNode(val, null);
            }
            return headNode;
        }
}

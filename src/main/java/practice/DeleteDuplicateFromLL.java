package practice;

import java.util.HashSet;

public class DeleteDuplicateFromLL {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(6))));
        ListNode uniList= deleteDuplicates(listNode);
        while (uniList!=null){
            System.out.println(uniList.val);
            uniList = uniList.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode tempNode = head;
        if(head == null){
            return null;
        }
        ListNode uniqueListHeadR = new ListNode(tempNode.val, null);
        ListNode uniqueListHead = uniqueListHeadR;
        HashSet<Integer> uniList = new HashSet<>();
        tempNode= tempNode.next;
        while(tempNode!=null){
            if(uniList.add(tempNode.val)){
                uniqueListHead.next = new ListNode(tempNode.val, null);
                uniqueListHead = uniqueListHead.next;
            }
            tempNode = tempNode.next;
        }
        return uniqueListHeadR;
    }
}

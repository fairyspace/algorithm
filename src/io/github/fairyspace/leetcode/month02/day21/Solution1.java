package io.github.fairyspace.leetcode.month02.day21;

public class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode=head;
        ListNode preNode=null;

        while (currentNode != null) {
            ListNode tempNode= currentNode.next;
            currentNode.next=preNode;
            preNode=currentNode;
            currentNode=tempNode;
        }

        return preNode;
    }

    public static void main(String[] args) {
                Solution1 solution1 = new Solution1();
                ListNode listNode1 = new ListNode(1);
                ListNode listNode2= new ListNode(2);
                ListNode listNode3 = new ListNode(3);
                ListNode listNode4 = new ListNode(4);
                listNode3.next=listNode4;
                listNode2.next=listNode3;
                listNode1.next=listNode2;
                ListNode listNode = solution1.reverseList(listNode1);
    }
}

package io.github.fairyspace.leetcode.month02.day18;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-22 20:02
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution1 {

    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return head;

        if (head.val == val) {
            head=head.next;
            head=removeElements(head, val);
        }else {
            ListNode listNode = removeElements(head.next, val);
            head.next=listNode;
        }

        return head;
    }
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNode = solution1.removeElements(listNode1, 2);
        while (listNode != null) {
            System.err.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

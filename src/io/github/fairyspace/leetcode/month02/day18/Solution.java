package io.github.fairyspace.leetcode.month02.day18;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-22 17:55
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = null;
        ListNode point = head;
        while (point != null) {
            if (point.val == val) {
                /*ε¦ζζ―ε€΄θηΉοΌι£δΉε»ε€΄*/
                if (pre == null) {
                    head = point.next;
                    point = head;
                    continue;
                } else {
                    pre.next = point.next;
                }

            }else {
              pre=point;
            }

            point = point.next;
        }

        return head;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNode = solution.removeElements(listNode1, 2);

        while (listNode != null) {
            System.err.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

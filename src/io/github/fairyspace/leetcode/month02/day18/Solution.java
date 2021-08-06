package io.github.fairyspace.leetcode.month02.day18;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-22 17:55
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = null;
        ListNode point = head;
        while (point != null) {
            if (point.val == val) {
                /*如果是头节点，那么去头*/
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

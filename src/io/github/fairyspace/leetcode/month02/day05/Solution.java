package io.github.fairyspace.leetcode.month02.day05;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-15 18:29
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;

        ListNode farst=head;
        ListNode low=head;

        while (low!=null&&farst!=null) {
            low=low.next;
            farst = farst.next;

            if(farst!=null){
                farst = farst.next;
            }else {
                return false;
            }

            if (farst == low) {
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode1;
        boolean b = solution.hasCycle(listNode1);
        System.err.println(b);
    }

}

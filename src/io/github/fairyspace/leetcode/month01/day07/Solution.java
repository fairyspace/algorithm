package io.github.fairyspace.leetcode.month01.day07;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-05-26 14:27
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode listNode;
        if (l1.val < l2.val) {
            listNode=l1;
        }else{
            listNode=l2;
        }
        listNode.next = mergeTwoLists(listNode.next, l1.val >= l2.val ? l1 : l2);
        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);

        ListNode listNodea = new ListNode(1);
        ListNode listNodeb = new ListNode(3);
        ListNode listNodec = new ListNode(4);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNodea.next=listNodeb;
        listNodeb.next=listNodec;
        Solution solution = new Solution();
        ListNode listNode = solution.mergeTwoLists(listNode1, listNodea);

    }
}

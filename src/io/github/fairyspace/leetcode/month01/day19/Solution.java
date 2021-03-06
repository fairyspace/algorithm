package io.github.fairyspace.leetcode.month01.day19;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-06-30 11:58
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        /*12*/
        if (head==null) {
            return head;
        }
        if(head.next==null){
            /*δΈδΈͺζΆε*/
            return head;
        }

        if (head.val == head.next.val) {
            ListNode listNode = deleteDuplicates(head.next);
            return listNode;
        }else{
            ListNode listNode = deleteDuplicates(head.next);
             head.next=listNode;
            return head;
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode5 = new ListNode(3);
        ListNode listNode4 = new ListNode(3,listNode5);
        ListNode listNode3 = new ListNode(2,listNode4);
        ListNode listNode2 = new ListNode(1,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);

/*
        ListNode listNode2 = new ListNode(2,null);
        ListNode listNode1 = new ListNode(1,listNode2);*/

        ListNode listNode = solution.deleteDuplicates(listNode1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}

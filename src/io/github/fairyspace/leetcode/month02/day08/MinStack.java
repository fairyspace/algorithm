package io.github.fairyspace.leetcode.month02.day08;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-16 14:58
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class MinStack {
    ListNode head;

    public MinStack() {

    }

    public void push(int val) {
        if (head == null) {
            head=new ListNode(val, val);
        }else{
            head=new ListNode(val, Math.min(val, head.min),head);
        }
    }

    public void pop() {
        head=head.next;
    }

    public int top() {
      return  head.val;
    }

    public int getMin() {
        return  head.min;
    }


    private class ListNode{
        int val;
        int min;
        ListNode next;

        public ListNode(int val, int min, ListNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }

        public ListNode(int val, int min) {
            this.val = val;
            this.min = min;
        }

        public ListNode() {
        }
    }



}

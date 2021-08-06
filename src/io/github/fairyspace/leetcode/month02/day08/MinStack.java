package io.github.fairyspace.leetcode.month02.day08;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-16 14:58
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

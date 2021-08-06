package io.github.fairyspace.leetcode.month01.day14;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-16 16:48
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }

        if(l2==null){
            return l1;
        }

        int i=(l1.val+l2.val)%10;
        int j=(l1.val+l2.val)/10;
        ListNode listNodeX = new ListNode(i);
        /*判断是否进位*/
        if (j > 0) {
            l1.next = addTwoNumbers(l1.next, new ListNode(1));
        }
        ListNode listNodeY= addTwoNumbers(l1.next,l2.next);
        listNodeX.next=listNodeY;
        return listNodeX;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1=new ListNode(9);
        ListNode l11=new ListNode(9);
        l1.next=l11;
        ListNode l111=new ListNode(9);
        l11.next=l111;
        ListNode l2=new ListNode(9);
        ListNode l22=new ListNode(9);
        l2.next=l22;
        ListNode l222=new ListNode(9);
        l22.next=l222;
        ListNode listNode = solution.addTwoNumbers(l1, l2);

        do{
            System.err.print(listNode.val);
            listNode=listNode.next;
        }
        while (listNode!=null);



    }
}

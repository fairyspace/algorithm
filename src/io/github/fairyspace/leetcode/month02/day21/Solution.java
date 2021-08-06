package io.github.fairyspace.leetcode.month02.day21;

import java.util.Stack;

/**
 * @author xuquanru
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> listNodes = new Stack<>();
        if (head==null) {
            return null;
        }

        while (head!=null){
            listNodes.push(head);
            head= head.next;
        }

        head =  listNodes.pop();
        ListNode   cur =  head;
        while (!listNodes.isEmpty()) {
            ListNode  temp =  listNodes.pop();
            cur.next=temp;
            cur=cur.next;
            cur.next=null;
        }

        return head;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head=new ListNode(1,null);
        ListNode head2=new ListNode(2,null);
        ListNode head3=new ListNode(3,null);
        head.next=head2;
        head2.next=head3;
        ListNode listNode = solution.reverseList(head);
    }




}

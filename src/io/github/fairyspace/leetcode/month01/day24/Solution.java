package io.github.fairyspace.leetcode.month01.day24;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-06 09:33
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int maxDepth(TreeNode root) {

        if(root==null)return 0;
        int depth=1;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int max = Math.max(left, right);
        return max+1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root4=new TreeNode(3);
        TreeNode root5=new TreeNode(4);
        TreeNode root2=new TreeNode(2,root4,root5);
        TreeNode root6=new TreeNode(4,null,null);
        TreeNode root7=new TreeNode(3,null,null);
        TreeNode root3=new TreeNode(2,root6,root7);
        TreeNode root=new TreeNode(1,root2,root3);
        int i = solution.maxDepth(root);
        System.err.println(i);
    }


}

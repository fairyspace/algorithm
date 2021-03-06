package io.github.fairyspace.leetcode.month01.day27;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-12 17:46
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution1 {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        int depth=Integer.MAX_VALUE;
        if (root.left != null) {
            depth = Math.min(minDepth(root.left), depth);
        }

        if (root.right != null) {
            depth = Math.min(minDepth(root.right), depth);
        }

        return depth+1;
    }
}

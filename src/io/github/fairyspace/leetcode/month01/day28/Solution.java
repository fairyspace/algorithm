package io.github.fairyspace.leetcode.month01.day28;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-12 17:58
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        if (root.left == null && root.right == null) {
            boolean b = root.val == targetSum ? true : false;
            return b;
        }
        int diffSum=targetSum-root.val;
        boolean b = hasPathSum(root.left, diffSum);
        if(!b){
           b = hasPathSum(root.right, diffSum);
        }
        return b;
    }
}

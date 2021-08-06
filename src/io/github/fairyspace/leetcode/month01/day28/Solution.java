package io.github.fairyspace.leetcode.month01.day28;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-12 17:58
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

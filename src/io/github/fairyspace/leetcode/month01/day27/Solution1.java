package io.github.fairyspace.leetcode.month01.day27;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-12 17:46
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

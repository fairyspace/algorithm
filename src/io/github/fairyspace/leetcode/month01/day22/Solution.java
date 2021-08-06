package io.github.fairyspace.leetcode.month01.day22;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-05 13:07
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null||q==null) {
            return  false;
        }

        if (p.val != q.val) {
            return  false;
        }

        boolean sameTree = isSameTree(p.left, q.left);

        if (sameTree) {
            sameTree = isSameTree(p.right, q.right);
        }

        return sameTree;

    }
}

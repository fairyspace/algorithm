package io.github.fairyspace.leetcode.month01.day22;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-05 13:07
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
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

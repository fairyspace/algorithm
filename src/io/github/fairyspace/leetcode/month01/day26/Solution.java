package io.github.fairyspace.leetcode.month01.day26;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-09 17:54
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        int left = getHigh(root.left);
        int right = getHigh(root.right);
        int abs = Math.abs(left - right);
        if(abs>1)return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }




    /*获取一棵树得高度*/
    public int getHigh(TreeNode treeNode){
        if(treeNode==null)return 0;
        int deep=1;
        int left = getHigh(treeNode.left);
        int right = getHigh(treeNode.right);
        int max = Math.max(left, right);
        int i = max + deep;
        return i;
    }

    public static void main(String[] args) {

    }

}

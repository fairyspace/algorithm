package io.github.fairyspace.leetcode.month01.day26;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-09 17:54
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
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




    /*θ·εδΈζ£΅ζ εΎι«εΊ¦*/
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

package io.github.fairyspace.leetcode.month01.day26;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-09 17:54
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution1 {
    public boolean isBalanced(TreeNode root) {
      return getHigh(root)>=0;
    }




    /*θ·εδΈζ£΅ζ εΎι«εΊ¦*/
    public int getHigh(TreeNode treeNode){
        if(treeNode==null)return 0;
        int left = getHigh(treeNode.left);
        int right = getHigh(treeNode.right);

        if (left==-1||Math.abs(left - right) > 1||right==-1) {
            return -1;
        }else {
            int max = Math.max(left, right)+1;
            return max;
        }
    }

    public static void main(String[] args) {

    }

}

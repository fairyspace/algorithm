package io.github.fairyspace.leetcode.month01.day27;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-12 16:35
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {

    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        /*θ·εε·¦θΎΉηιΏεΊ¦*/
        int i = minDepth(root.left);
        int j = minDepth(root.right);
        if(root.left!=null&&root.right==null){
            return i+1;
        }
        if(root.right!=null&&root.left==null){
            return j+1;
        }

        return  Math.min(i, j)+1;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root=new TreeNode(2);
        TreeNode root3=new TreeNode(3);
        root.right=root3;
        TreeNode root4=new TreeNode(4);
        root3.right=root4;
        TreeNode root5=new TreeNode(5);
        root4.right=root5;
        TreeNode root6=new TreeNode(6);
        root5.right=root6;


        int i = solution.minDepth(root);
        System.err.println(i);
        System.err.println();
    }


}

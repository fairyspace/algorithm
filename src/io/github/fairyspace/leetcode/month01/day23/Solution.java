package io.github.fairyspace.leetcode.month01.day23;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 *
 *    2         2
 *    / \       / \
 *   3   4     4   3
 *  / \ / \   / \ / \
 * 8  7 6  5 5  6 7  8
 *
 * δ½θοΌwang_ni_ma
 * ιΎζ₯οΌhttps://leetcode-cn.com/problems/symmetric-tree/solution/dong-hua-yan-shi-101-dui-cheng-er-cha-shu-by-user7/
 * ζ₯ζΊοΌεζ£οΌLeetCodeοΌ
 * θδ½ζε½δ½θζζγεδΈθ½¬θ½½θ―·θη³»δ½θθ·εΎζζοΌιεδΈθ½¬θ½½θ―·ζ³¨ζεΊε€γ
 *
 * π @Author: Stephen
 * π Create: 2021-07-05 16:55
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean symmetric = symmetric(root.left, root.right);
        return symmetric;
    }

    private boolean symmetric(TreeNode left,TreeNode right){

        if(left==null&&right==null){
            return true;
        }

        if (left == null||right==null) {
            return false;
        }

        if (left.val!=right.val) {
            return  false;
        }

        boolean res = symmetric(left.left, right.right);
        if(res){
            res = symmetric(left.right, right.left);
        }
        return  res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root4=new TreeNode(3);
        TreeNode root5=new TreeNode(4);
        TreeNode root2=new TreeNode(2,root4,root5);
        TreeNode root6=new TreeNode(4,null,null);
        TreeNode root7=new TreeNode(3,null,null);
        TreeNode root3=new TreeNode(2,root6,root7);

        TreeNode root=new TreeNode(1,root2,root3);
        boolean symmetric = solution.isSymmetric(root);
        System.err.println(symmetric);
    }
}

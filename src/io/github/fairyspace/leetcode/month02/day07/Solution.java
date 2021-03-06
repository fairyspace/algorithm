package io.github.fairyspace.leetcode.month02.day07;

import java.util.ArrayList;
import java.util.List;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-16 14:51
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> integers=new ArrayList<>();
        if (root == null) {
            return integers;
        }

        List<Integer> left = postorderTraversal(root.left);
        List<Integer> right = postorderTraversal(root.right);
        integers.addAll(left);
        integers.addAll(right);
        integers.add(root.val);
        return  integers;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root=new TreeNode(1);
        TreeNode root2=new TreeNode(2);
        TreeNode root3=new TreeNode(3);
        root.right = root2;
        root2.left = root3;
        List<Integer> integers = solution.postorderTraversal(root);
        System.err.println(integers);
    }
}

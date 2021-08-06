package io.github.fairyspace.leetcode.month02.day07;

import java.util.ArrayList;
import java.util.List;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-16 14:51
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

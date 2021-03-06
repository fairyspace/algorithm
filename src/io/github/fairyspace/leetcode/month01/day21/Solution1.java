package io.github.fairyspace.leetcode.month01.day21;

import java.util.ArrayList;
import java.util.List;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-05 12:46
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> integers=new ArrayList<>();
        traversal(root,integers);
        return integers;
    }

    private void traversal(TreeNode root,List<Integer> integers){
        if (root != null) {
            traversal(root.left,integers);
            integers.add(root.val);
            traversal(root.right,integers);
        }else{
            return;
        }

    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        TreeNode root4=new TreeNode(4);
        TreeNode root5=new TreeNode(5);
        TreeNode root2=new TreeNode(2,root4,root5);
        TreeNode root6=new TreeNode(6,null,null);
        TreeNode root3=new TreeNode(3,root6,null);
        TreeNode root=new TreeNode(1,root2,root3);
        List<Integer> integers = solution.inorderTraversal(root);

        for (Integer integer : integers) {
            System.err.println(integer);
        }
    }

}

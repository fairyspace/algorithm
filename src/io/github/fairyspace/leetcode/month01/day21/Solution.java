package io.github.fairyspace.leetcode.month01.day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-02 19:30
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> integers=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        while (stack.size()>0||root != null) {

            if(root != null){
                stack.add(root);
                root=root.left;
            }else{
                TreeNode Temp = stack.pop();
                integers.add(Temp.val);
                root = Temp.right;
            }


        }

        return integers;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

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

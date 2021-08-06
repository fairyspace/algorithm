package io.github.fairyspace.leetcode.month01.day26;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-09 17:54
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution1 {
    public boolean isBalanced(TreeNode root) {
      return getHigh(root)>=0;
    }




    /*获取一棵树得高度*/
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

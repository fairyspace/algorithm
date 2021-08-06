package io.github.fairyspace.leetcode.month01.day25;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description [-10,-3,0,5,9]
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-06 19:14
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0) {
            return null;
        }
        TreeNode node = buildTree(nums, 0, nums.length - 1);
        return node;
    }

    private TreeNode buildTree(int[] nums,int start,int end) {
        if(start>end)return null;
        int middle=(start+end)/2;
        int num = nums[middle];
        TreeNode node = new TreeNode(num);
        TreeNode left = buildTree(nums, start, middle - 1);
        TreeNode right = buildTree(nums, middle +1, end);
        node.left=left;
        node.right=right;
        return node;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        TreeNode node = solution.sortedArrayToBST(nums);

    }
}

package io.github.fairyspace.leetcode.month01.day01;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-19 17:50
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] backNums = {};
        for (int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (diff == nums[j]) {
                     backNums=new int[]{i,j};
                }
            }
        }
        return backNums;
    }

    public static void main(String[] args) {
        int[] array=new int[]{3,2,4};
        int target=6;
        int[] ints = twoSum(array, target);
        for (int anInt : ints) {
            System.err.println(anInt);
        }
    }
}

package io.github.fairyspace.leetcode.month01.day12;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * https://leetcode-cn.com/problems/maximum-subarray/solution/xiang-xi-jie-du-dong-tai-gui-hua-de-shi-xian-yi-li/
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-10 11:11
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    //nums = [-2,1,-3,4,-1,2,1,-5,4]
    public int maxSubArray(int[] nums) {
        int max_final = nums[0];
        int max_now = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max_now = max_now + nums[i];
            max_now=nums[i]>max_now?nums[i]:max_now;
            max_final=max_now>max_final?max_now:max_final;
        }
        return max_final;
    }

    public static void main(String[] args) {
        int[]   nums = {-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        int i = solution.maxSubArray(nums);
        System.err.println(i);
    }
}

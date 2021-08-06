package io.github.fairyspace.leetcode.month02.day12;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen [2,2,1,1,1,1,2,2,2]
 * 🍁 Create: 2021-07-19 18:08
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count=1;

        for (int i = 1; i < nums.length; i++) {
            if(count>nums.length/2)return majority;

            if (count == 0) {
                majority = nums[i];
            }

            count = nums[i] == majority ? count+1 : count-1;



        }

        return majority;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.majorityElement(new int[]{2,2,1,1,1,1,2,2,2});
        System.err.println(i);
    }
}

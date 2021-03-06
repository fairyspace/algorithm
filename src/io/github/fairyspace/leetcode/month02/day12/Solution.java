package io.github.fairyspace.leetcode.month02.day12;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen [2,2,1,1,1,1,2,2,2]
 * π Create: 2021-07-19 18:08
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
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

package io.github.fairyspace.leetcode.month01.day01;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 *
 * θΎε₯οΌnums = [2,7,11,15], target = 9
 * θΎεΊοΌ[0,1]
 * θ§£ιοΌε δΈΊ nums[0] + nums[1] == 9 οΌθΏε [0, 1] γ
 * ζ₯ζΊοΌεζ£οΌLeetCodeοΌ
 * ιΎζ₯οΌhttps://leetcode-cn.com/problems/two-sum
 *
 * π @Author: Stephen
 * π Create: 2021-05-19 17:50
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
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

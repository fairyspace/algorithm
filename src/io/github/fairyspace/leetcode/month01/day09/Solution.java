package io.github.fairyspace.leetcode.month01.day09;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-05-28 11:51
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int duplicatenNum=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val) {
                duplicatenNum++;
            }else {
                nums[i-duplicatenNum]=nums[i];
            }
        }
        return nums.length-duplicatenNum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        int i = solution.removeElement(ints, 2);
        System.err.println(i);
    }
}

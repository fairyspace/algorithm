package io.github.fairyspace.leetcode.month01.day11;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-06-09 18:11
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<target){
                index++;
                continue;
            }else{
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1,3,5,6};
        int i = solution.searchInsert(ints, 5);
        System.err.println(i);
    }
}

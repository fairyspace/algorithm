package io.github.fairyspace.leetcode.month02.day04;


/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description[2,2,1]
 * π @Author: Stephen
 * π Create: 2021-07-15 17:50
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
       /* boolean matches = Pattern.matches("\\d+|\\w+", "A12");//θΏεtrue
        System.err.println(matches);*/

        Solution solution = new Solution();
        int i = solution.singleNumber(new int[]{2, 2, 1});
        System.err.println(i);


    }
}

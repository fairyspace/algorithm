package io.github.fairyspace.leetcode.month01.day18;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-06-28 17:49
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {

    public int climbStairs(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        if(n==3)return 3;
        int result= 2*climbStairs(n-2)+climbStairs(n-3);

        return result;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.climbStairs(5);
        System.err.println(i);
    }
}

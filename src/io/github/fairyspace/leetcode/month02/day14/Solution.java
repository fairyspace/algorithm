package io.github.fairyspace.leetcode.month02.day14;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-20 09:29
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while (n>=5) {
            n = n / 5;
            count=n+count;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.trailingZeroes(30);
        System.err.println(i);
    }
}

package io.github.fairyspace.leetcode.month02.day16;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-22 15:22
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int hammingWeight(int n) {
        int count=0;

        for (int i = 0; i < 32; i++) {
            count=(n&1)==1?count+1:count;
            n=n>>>1;
        }


        return count;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.hammingWeight(11);
        System.err.println(i);

    }
}

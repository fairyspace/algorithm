package io.github.fairyspace.leetcode.month02.day27;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: algorithm
 * π Description:
 * π @author: xuquanru
 * π Create: 2021/8/19
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        boolean powerOfTwo = solution1.isPowerOfTwo(32);
        System.err.println(~1);
    }

    public boolean isPowerOfTwo(int n) {
        if(n<=0) {
            return false;
        }
        int i = n & (n - 1);
        return i==0?true:false;
    }
}

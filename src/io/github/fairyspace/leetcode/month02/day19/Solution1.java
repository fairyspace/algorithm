package io.github.fairyspace.leetcode.month02.day19;

import java.util.Arrays;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description ε°δΊn
 * π @Author: Stephen
 * π Create: 2021-07-23 19:41
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution1 {
    public int countPrimes(int n) {
        int[] ints = new int[n];
        Arrays.fill(ints, 1);
        int ans=0;
        for (int i = 2; i < n; i++) {
            if (ints[i] == 1) {
                ans = ans + 1;
                if ((long)i * i < n) {
                    for (int j = i*i; j < n; j=j+i) {
                        ints[j]=0;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int i = solution.countPrimes(49979);
        System.err.println(i);
    }
}

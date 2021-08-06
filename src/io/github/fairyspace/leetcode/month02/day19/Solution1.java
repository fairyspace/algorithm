package io.github.fairyspace.leetcode.month02.day19;

import java.util.Arrays;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description 小于n
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-23 19:41
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

package io.github.fairyspace.leetcode.month02.day16;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-22 15:22
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

package io.github.fairyspace.leetcode.month02.day27;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: algorithm
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2021/8/19
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

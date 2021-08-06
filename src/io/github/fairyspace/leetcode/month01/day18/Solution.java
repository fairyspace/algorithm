package io.github.fairyspace.leetcode.month01.day18;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-28 17:49
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

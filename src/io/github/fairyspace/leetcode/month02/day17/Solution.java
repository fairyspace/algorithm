package io.github.fairyspace.leetcode.month02.day17;

import java.util.HashSet;
import java.util.Set;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-22 16:07
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    private Set<Integer> integerSet=new HashSet<>();

    public boolean isHappy(int n) {
        if(n==1)return true;
        int res=0;
        while (n > 0) {
            int i = n % 10;
            res = i * i+res;
            n = n / 10;
        }

        if(integerSet.contains(res))return false;
        integerSet.add(res);

        boolean happy = isHappy(res);

        return happy;

    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean happy = solution.isHappy(2);
        System.err.println(happy);
    }
}

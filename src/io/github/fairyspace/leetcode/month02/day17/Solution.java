package io.github.fairyspace.leetcode.month02.day17;

import java.util.HashSet;
import java.util.Set;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-22 16:07
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

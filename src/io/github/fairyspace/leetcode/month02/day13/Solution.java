package io.github.fairyspace.leetcode.month02.day13;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-19 18:49
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        int weight=1;
        for (int i = columnTitle.length()-1; i >=0 ; i--) {
            char c = columnTitle.charAt(i);
            result= ((c - 'A')+1)*weight+result;
            weight=weight*26;
        }


        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.titleToNumber("ZY");
        System.err.println(i);
    }
}

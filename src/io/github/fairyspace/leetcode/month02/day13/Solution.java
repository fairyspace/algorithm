package io.github.fairyspace.leetcode.month02.day13;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-19 18:49
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
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

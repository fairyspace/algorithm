package io.github.fairyspace.leetcode.month01.day13;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-06-11 19:59
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution2 {
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        if(split.length==0)return 0;
        int s1 = split[split.length - 1].length();
        return s1;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int i = solution2.lengthOfLastWord(" ");
        System.err.println(i);
    }
}

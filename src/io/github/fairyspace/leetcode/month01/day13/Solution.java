package io.github.fairyspace.leetcode.month01.day13;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-06-11 19:26
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean clean=false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c!=' '){
                if (clean == true) {
                    count=0;
                    clean=false;
                }
                count++;
            }else{
                clean=true;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.lengthOfLastWord("hello world");
        System.err.println(i);

    }
}

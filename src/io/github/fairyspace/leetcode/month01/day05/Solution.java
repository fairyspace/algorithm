package io.github.fairyspace.leetcode.month01.day05;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-05-25 14:30
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) return result;
        String headStr = strs[0];
        for (int i = 0; i < headStr.length(); i++) {
            char c = headStr.charAt(i);
            boolean normal = true;
            for (int j = 1; j < strs.length; j++) {
                //ε€ηειΏεη­ab, a
                if (i < strs[j].length()) {
                    char c1 = strs[j].charAt(i);
                    if (c1 == c) {
                        continue;
                    } else {
                        normal = false;
                        break;
                    }
                } else {
                    normal = false;
                }
            }

            if (normal) {
                result = result + c;
            } else {
                break;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"ab", "a"};
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(strings);
        System.err.println(s);
    }
}

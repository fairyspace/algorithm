package io.github.fairyspace.leetcode.month01.day05;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-25 14:30
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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
                //处理前长后短ab, a
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

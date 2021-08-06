package io.github.fairyspace.leetcode.month01.day05;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-25 15:41
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        //假设他是答案，应该是最短的
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(str)) {
              str= str.substring(0, str.length() - 1);
            }
        }

        return str;
    }

    public static void main(String[] args) {
        String[] strings = {"ab", "a"};
        Solution2 solution = new Solution2();
        String s = solution.longestCommonPrefix(strings);
        System.err.println(s);
    }
}

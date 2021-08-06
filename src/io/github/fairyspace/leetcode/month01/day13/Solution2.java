package io.github.fairyspace.leetcode.month01.day13;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-11 19:59
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

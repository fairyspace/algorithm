package io.github.fairyspace.leetcode.month01.day13;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-11 19:26
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

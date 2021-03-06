package io.github.fairyspace.leetcode.month01.day10;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-05-31 10:29
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int[] next = getNext(needle);
        int spoi = 0;
        int ppoi = 0;
        while (spoi < haystack.length()) {
            if (haystack.charAt(spoi) == needle.charAt(ppoi)) {
                spoi++;
                ppoi++;
                if (ppoi == needle.length()) {
                    return spoi - ppoi;
                }
            } else {
                if (ppoi != 0) {
                    spoi = spoi - next[--ppoi];
                } else {
                    spoi = spoi + 1;
                }
                ppoi = 0;
            }
        }
        return -1;
    }

    private int[] getNext(String needle) {
        int[] next = new int[needle.length()];
        int index = 1;
        int temp = 0;
        while (index < needle.length()) {
            if (needle.charAt(index) == needle.charAt(temp)) {
                temp++;
                next[index] = temp;
                index++;
            } else if (temp != 0) {
                /*next[temp-1]+1=next[temp]  */
                temp = next[temp - 1];
            } else {
                temp = next[0];
                index++;
            }

        }
        return next;
    }

    public static void main(String[] args) {
        System.out.println();
        Solution solution = new Solution();
        //00112323234564
        int[] res = solution.getNext("ABAABABABAABAA");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }

    }
}

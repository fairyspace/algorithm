package io.github.fairyspace.leetcode.month01.day13;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-06-11 19:59
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution3 {
    public int lengthOfLastWord(String s) {
        int count=0;
        for (int index = s.length()-1; index >= 0; index--) {
            if(s.charAt(index)!=' '){
                count++;
            }else{
                if(count>0){
                    return count;
                }
            }


        }
        return  count;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int i = solution3.lengthOfLastWord(" ");
        System.err.println(i);
    }
}

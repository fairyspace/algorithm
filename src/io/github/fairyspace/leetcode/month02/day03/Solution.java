package io.github.fairyspace.leetcode.month02.day03;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-15 17:22
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null)return false;

        int left=0;
        int right=s.length()-1;

        while (right>left) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            boolean letterOrDigitL = Character.isLetterOrDigit(leftChar);
            boolean letterOrDigitR = Character.isLetterOrDigit(rightChar);

            if(!letterOrDigitL){
                left++;
                continue;
            }

            if(!letterOrDigitR){
                right--;
                continue;
            }

            left++;
            right--;

            if(leftChar==rightChar) {
                continue;
            }else {
                /*ζ₯ηεζΉζ―ε¦ζ―ε­ζ―*/
                if (Character.isLetter(leftChar) && Character.isLetter(rightChar)) {
                    boolean b = Character.toUpperCase(leftChar) == Character.toUpperCase(rightChar);
                    if(b)continue;
                }
                return  false;
            }


        }

        return true;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome1 = solution.isPalindrome("Aama");
        System.err.println(palindrome1);

    }
}

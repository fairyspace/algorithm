package io.github.fairyspace.leetcode.month01.day15;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-16 18:50
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i]!=0){
                return digits;
            }
        }

        /*能执行到这里必定是999*/
        int[] ints = new int[digits.length+1];
        ints[0]=1;
        return ints;




    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.plusOne(new int[]{9, 9, 9, 9});
        for (int i = 0; i < ints.length; i++) {
            System.err.println(ints[i]);
        }
    }
}

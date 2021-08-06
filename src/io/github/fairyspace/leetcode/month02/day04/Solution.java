package io.github.fairyspace.leetcode.month02.day04;


/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description[2,2,1]
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-15 17:50
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
       /* boolean matches = Pattern.matches("\\d+|\\w+", "A12");//返回true
        System.err.println(matches);*/

        Solution solution = new Solution();
        int i = solution.singleNumber(new int[]{2, 2, 1});
        System.err.println(i);


    }
}

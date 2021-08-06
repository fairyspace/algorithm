package io.github.fairyspace.leetcode.month01.day09;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-28 11:51
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int duplicatenNum=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val) {
                duplicatenNum++;
            }else {
                nums[i-duplicatenNum]=nums[i];
            }
        }
        return nums.length-duplicatenNum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        int i = solution.removeElement(ints, 2);
        System.err.println(i);
    }
}

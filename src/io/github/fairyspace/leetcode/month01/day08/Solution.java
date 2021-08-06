package io.github.fairyspace.leetcode.month01.day08;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-27 10:27
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){return 0;}
        int temp = nums[0];
        int troubleNums=0;
        for (int i = 1; i < nums.length; i++) {
            if (temp == nums[i]) {
                troubleNums++;
            }else{
                temp = nums[i];
                nums[i - troubleNums]=temp;
            }
        }

        return nums.length-troubleNums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.removeDuplicates(new int[]
                {});
        System.err.println(i);
    }
}

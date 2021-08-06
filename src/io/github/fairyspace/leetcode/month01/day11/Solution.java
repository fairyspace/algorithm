package io.github.fairyspace.leetcode.month01.day11;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-09 18:11
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<target){
                index++;
                continue;
            }else{
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1,3,5,6};
        int i = solution.searchInsert(ints, 5);
        System.err.println(i);
    }
}

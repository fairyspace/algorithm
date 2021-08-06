package io.github.fairyspace.leetcode.month02.day10;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-19 11:44
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1,right+1};
            } else if (sum < target) {
                left++;
            }else {
                right--;
            }
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] ints = solution1.twoSum(new int[]{1, 2, 5, 7, 11, 15}, 9);
        for (int anInt : ints) {
            System.err.println(anInt);
        }
    }
}

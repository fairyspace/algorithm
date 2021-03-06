package io.github.fairyspace.leetcode.month02.day10;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-19 11:44
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
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

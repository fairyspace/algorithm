package io.github.fairyspace.leetcode.month02.day10;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description [1,2,5,7,11,15], target = 9
 * π @Author: Stephen
 * π Create: 2021-07-19 09:50
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i <numbers.length ; i++) {
            int diff = target - numbers[i];
            for (int j = i+1; j <numbers.length ; j++) {
                if(numbers[j]==diff){
                    return new int[]{i, j};
                }
                if (numbers[j] > diff) {
                    break;
                }
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{1,2,3,4,4,9,56,90}, 8);
        for (int anInt : ints) {
            System.err.println(anInt);
        }

    }
}


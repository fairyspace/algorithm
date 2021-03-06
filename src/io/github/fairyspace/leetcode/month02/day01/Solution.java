package io.github.fairyspace.leetcode.month02.day01;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-13 18:45
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice=0;
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>buyPrice){
                maxPrice = Math.max(prices[i]-buyPrice, maxPrice);
            }else{
                buyPrice=prices[i];
            }
        }

        return maxPrice;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {7, 2, 10, 1, 8, 4};
        int i = solution.maxProfit(ints);
        System.err.println(i);
    }
}

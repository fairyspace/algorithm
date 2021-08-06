package io.github.fairyspace.leetcode.month02.day01;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-13 18:45
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

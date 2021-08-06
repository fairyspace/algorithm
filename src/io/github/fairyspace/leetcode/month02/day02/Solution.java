package io.github.fairyspace.leetcode.month02.day02;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-14 18:43
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {

    public int maxProfit(int[] prices) {
        /*设置初始值*/
        int buyPrice = prices[0];
        int sumPrice=0;


        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                if(i+1<prices.length){
                    if(prices[i+1]>prices[i]){
                        continue;
                    }else{
                        sumPrice= prices[i]-buyPrice+sumPrice;
                        buyPrice=prices[i+1];
                        i++;
                    }
                }else{
                    sumPrice= prices[i]-buyPrice+sumPrice;
                }
            }else {
                buyPrice = prices[i];
            }
        }


        return sumPrice;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        // [1,2,3,4,5,1,7]
        int i = solution.maxProfit(new int[]{7, 2, 5, 3, 6, 4});
        int j = solution.maxProfit(new int[]{1,2,3,4,5});
        System.err.println(i);
        System.err.println(j);
    }
}

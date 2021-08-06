package io.github.fairyspace.leetcode.month02.day19;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-23 16:44
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public int countPrimes(int n) {
        int count=0;
        for (int i = 2; i < n; i++) {
          count=isPrimes(i)?count+1:count;
        }
        return count;
    }

    private boolean isPrimes(int n){
        boolean isPrimes=true;
        for (int i = 2; i*i <n; i++) {
            if (n % i!=0) {
                continue;
            }else{
                return  false;
            }
        }
        
        return isPrimes;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.countPrimes(499979);
        System.err.println(i);
    }
}

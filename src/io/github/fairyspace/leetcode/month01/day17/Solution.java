package io.github.fairyspace.leetcode.month01.day17;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description ηι‘ΏθΏ­δ»£ζ³
 * π @Author: Stephen
 * π Create: 2021-06-23 14:21
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {

    public int mySqrt(int x) {

        double number=1;
        String s = x + "";
        int i = s.length() / 2;

        if(i>=1){
            String substring1 = s.substring(0, i);
            String substring2 = s.substring(i, s.length());
            double v1 = Double.parseDouble(substring1);
            double v2 = Double.parseDouble(substring2);
            number = Math.max(v1, v2);
        }

        number=getNumber(number,x);
            if(number<=1){
                return (int)number;
            }

            while (x<number*number){
                number=getNumber(number,x);
                System.err.println(number);
            }
        return (int) number;
    }


    private double getNumber(double x,int y){
        //double v = (x * x + y) / (2 * x);
        double v = (x + y/x)/2;
        return (double)(Math.floor(v * 100) / 100);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.mySqrt(10);
        System.err.println(i);
    }

}

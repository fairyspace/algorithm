package io.github.fairyspace.leetcode.month01.day02;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-05-21 10:37
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution2 {
    public static int reverse(int x) {
        int result=0;
        int multiple=10;
        while (x!=0){
            int i = x % 10;
                x = x / 10;
            int temp = result * multiple;
            if(result!=0&&temp/multiple!=result){
                result=0;break;
            }
            result = temp + i;
        }
        return result;
    }

    public static void main(String[] args) {
        int reverse = reverse(120);
        System.err.println(reverse);
    }
}

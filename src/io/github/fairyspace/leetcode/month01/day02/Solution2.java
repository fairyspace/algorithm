package io.github.fairyspace.leetcode.month01.day02;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-21 10:37
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

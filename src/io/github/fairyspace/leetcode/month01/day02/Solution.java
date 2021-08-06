package io.github.fairyspace.leetcode.month01.day02;
/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-20 15:19
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    static int  ff=1;
    static int Max= Integer.MAX_VALUE;
    static int Min= Integer.MIN_VALUE;
    public static int reverse(int x) {
       int j= getP(x);
       System.err.println(j);
       return j;
    }

    private static int getP(int x) {
        int j = x / 10;
        int i=x%10;
        if (j == 0) {
            return i;
        }else {
            int p = getP(j);
            int f=ff;
            ff=ff*10;
            int i2 = ff * i;
            int i1 = i2 + p;

            if (i!=0&&i2/i!=ff) {
                System.err.println("AAAAAA");
                i1=0;
            }


            if (p>0&&p > Max - i2) {
                System.err.println("BBBBBBB");
                i1=0;
            }

            if (p < 0 && p < Min - i2) {
                System.err.println("CCCCCCC");
                i1=0;
            }
            return i1;
        }
    }

    public static void main(String[] args) {
        reverse(-1563847412);
    }

}

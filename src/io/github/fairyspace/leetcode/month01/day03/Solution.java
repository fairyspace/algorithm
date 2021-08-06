package io.github.fairyspace.leetcode.month01.day03;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-21 11:39
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {

        public static boolean isPalindrome(int x) {
            if(x<0){return false;}
            int reverse = reverse(x);
            if(reverse==x)return true;
            return false;
        }
        private static int reverse(int x){
            int result=0;
            int multiple=10;
            while (x!=0){
                int i = x % 10;
                x=x/10;
                int temp = result * multiple;
                if(temp/multiple!=result){
                    result=0;
                    break;
                }
                result= temp +i;
            }

            return result;
        }


        static char ch;
    public static void main(String[] args) {
       int i=128;
        byte i1 = (byte) i;
        System.err.println(i1);
    }


}

package io.github.fairyspace.leetcode.month01.day16;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-21 15:46
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution2 {
    public String addBinary(String a, String b) {
        int diffLength = a.length() - b.length();
        if (diffLength > 0) {
            for (int i = 0; i < diffLength; i++) {
                b="0"+b;
            }
        } else if (diffLength < 0) {
            for (int i = 0; i < -diffLength; i++) {
                a="0"+a;
            }
        }

        int temp=0;
        String result="";
        for (int i = a.length()-1; i >= 0; i--) {
            int aNum = a.charAt(i)-'0';
            int bNum = b.charAt(i)-'0';
            int abNum = (aNum + bNum+temp)%2;
            temp=(aNum + bNum+temp)/2;
            result=abNum+result;
        }
        if(temp==1){
         result=temp+result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String s = solution2.addBinary("111", "100");
        System.err.println(s);
    }
}

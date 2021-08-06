package io.github.fairyspace.leetcode.month01.day16;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-17 11:15
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public String addBinary(String a, String b) {

        /*判断a和b是否需要补全*/
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


        String result = "";
        char charA = a.charAt(a.length() - 1);
        char charB = b.charAt(b.length() - 1);
        if (charA == charB) {
            result = "0";
            if (charA == '1') {
                /*进位*/
                result = "10";
            }
        }else{
            result = "1";
        }

        /*后续是否没有了*/
        if(a.length()-1!=0){
            /*先处理进位,任意一个串先加1*/
            if(result.equals("10")){
                /*111+1=1000先右边补0出结果再去掉0*/
               a = addBinary(a.substring(0, a.length() - 1) + "0", result);
               String left = addBinary(a.substring(0, a.length() - 1), b.substring(0, b.length() - 1));
               result = left.concat("0");
            }else{
                String left = addBinary(a.substring(0, a.length() - 1), b.substring(0, b.length() - 1));
                result = left.concat(result);
            }


        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "1";
        String b = "111";
        String s = solution.addBinary(a, b);
        System.err.println(s);
    }
}

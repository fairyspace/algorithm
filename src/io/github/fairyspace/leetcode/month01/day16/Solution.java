package io.github.fairyspace.leetcode.month01.day16;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-06-17 11:15
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public String addBinary(String a, String b) {

        /*ε€ζ­aεbζ―ε¦ιθ¦θ‘₯ε¨*/
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
                /*θΏδ½*/
                result = "10";
            }
        }else{
            result = "1";
        }

        /*εη»­ζ―ε¦ζ²‘ζδΊ*/
        if(a.length()-1!=0){
            /*εε€ηθΏδ½,δ»»ζδΈδΈͺδΈ²εε 1*/
            if(result.equals("10")){
                /*111+1=1000εε³θΎΉθ‘₯0εΊη»ζεε»ζ0*/
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

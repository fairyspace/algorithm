package io.github.fairyspace.leetcode.month02.day11;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-07-19 17:44
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution1 {
    public String convertToTitle(int columnNumber) {
        if(columnNumber<=0)return "";
        String result="";
        while (columnNumber > 0) {
            columnNumber--;
            int i = columnNumber % 26;

            result=Character.toString( (char) (i + 'A'))+result;
            columnNumber = columnNumber / 26;
        }

        return result;
    }
    public static void main(String[] args) {

    }
}

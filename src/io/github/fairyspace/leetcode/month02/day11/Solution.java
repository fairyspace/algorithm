package io.github.fairyspace.leetcode.month02.day11;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-19 13:59
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public String convertToTitle(int columnNumber) {
        char AStart=64;
        String result="";
       // Character.toString((char) (A + i-1));
        do {

            int i = columnNumber % 26;//2
            columnNumber = columnNumber / 26;//1
            if (i == 0) {
                result=  Character.toString((char) (AStart + 26))+result;
                columnNumber=columnNumber-1;
            }else{
                result=  Character.toString((char) (AStart + i))+result;
            }

        } while (columnNumber != 0);
        return result;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.convertToTitle(27);
        System.err.println(s);

    }

}

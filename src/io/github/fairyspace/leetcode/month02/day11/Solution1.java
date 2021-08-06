package io.github.fairyspace.leetcode.month02.day11;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-19 17:44
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

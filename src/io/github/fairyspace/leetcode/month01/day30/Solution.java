package io.github.fairyspace.leetcode.month01.day30;

import java.util.ArrayList;
import java.util.List;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 示例:
 * 输入: 3
 * 输出: [1,3,3,1]
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-13 17:44
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> realRow = getRealRow(rowIndex + 1);
        return realRow;
    }

    public List<Integer> getRealRow(int rowIndex){
        if (rowIndex == 0) return new ArrayList<Integer>();
        if (rowIndex == 1) {
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(1);
            return integers;
        }
        /*已知上一组*/
        List<Integer> pre = getRealRow(rowIndex - 1);
        List<Integer> current = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            int firstValue = 0;
            int SecondValue = 0;
            if (i - 1 >= 0) firstValue = pre.get(i - 1);
            if (i < rowIndex-1) SecondValue = pre.get(i);
            current.add(firstValue + SecondValue);
        }
        return current;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> row = solution.getRow(3);
        System.err.println(row);
    }
}

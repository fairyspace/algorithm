package io.github.fairyspace.leetcode.month01.day30;

import java.util.ArrayList;
import java.util.List;

/**
 * ๐๐๐๐๐๐๐๐๐๐๐๐้้ปไธ้ฟ๏ผ่กๅๅฐ่ณ๐๐๐๐๐๐๐๐๐๐๐๐
 * ๐ Program: mqdemo
 * ๐ Description
 * ๅจๆจ่พไธ่งไธญ๏ผๆฏไธชๆฐๆฏๅฎๅทฆไธๆนๅๅณไธๆน็ๆฐ็ๅใ
 * ็คบไพ:
 * ่พๅฅ: 3
 * ่พๅบ: [1,3,3,1]
 * ๐ @Author: Stephen
 * ๐ Create: 2021-07-13 17:44
 * ๐๐๐๐๐๐๐๐๐๐๐๐่ก่ไธ่พ๏ผๆชๆฅๅฏๆ๐๐๐๐๐๐๐๐๐๐๐๐
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
        /*ๅทฒ็ฅไธไธ็ป*/
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

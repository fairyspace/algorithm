package io.github.fairyspace.leetcode.month01.day29;

import java.util.ArrayList;
import java.util.List;

/**
 * ๐๐๐๐๐๐๐๐๐๐๐๐้้ปไธ้ฟ๏ผ่กๅๅฐ่ณ๐๐๐๐๐๐๐๐๐๐๐๐
 * ๐ Program: mqdemo
 * ๆฏไธชๆฐๆฏๅฎๅทฆไธๆนๅๅณไธๆน็ๆฐ็ๅใ
 * ๐ Description
 * [
 *      [1],
 *     [1,1]
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 *
 * ๐ @Author: Stephen
 * ๐ Create: 2021-07-12 18:31
 * ๐๐๐๐๐๐๐๐๐๐๐๐่ก่ไธ่พ๏ผๆชๆฅๅฏๆ๐๐๐๐๐๐๐๐๐๐๐๐
 **/
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        List<Integer> row=new ArrayList<>();
        row.add(1);
        result.add(row);

        if (numRows == 1) {
            return result;
        }

        /*็ฌฌไบ่กๅผๅง*/
        for (int i = 1; i < numRows; i++) {
            List<Integer> pre = result.get(i - 1);
            List<Integer> current = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                //่ชๅทฑ็ไฝ็ฝฎ-1,ไฝๆฏๅทฆๅณ2่พนไธ่ฝ่ถ็
                Integer inte1=0;
                Integer inte2=0;
                if ((j-1)>=0) inte1 = pre.get(j-1);//่ชๅทฑ็ไฝ็ฝฎ
                if(j<=i-1) inte2 = pre.get(j);//่ชๅทฑ็ไฝ็ฝฎ
                current.add(inte2 + inte1);
            }
            result.add(current);

        }


        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> generate = solution.generate(6);
        generate.forEach(integers -> {
            for (Integer integer : integers) {
                System.err.print(integer);
            }
            System.err.println("================================");
        });
    }
}

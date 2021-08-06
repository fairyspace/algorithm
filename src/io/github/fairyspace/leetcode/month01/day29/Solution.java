package io.github.fairyspace.leetcode.month01.day29;

import java.util.ArrayList;
import java.util.List;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 每个数是它左上方和右上方的数的和。
 * 🍁 Description
 * [
 *      [1],
 *     [1,1]
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 *
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-12 18:31
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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

        /*第二行开始*/
        for (int i = 1; i < numRows; i++) {
            List<Integer> pre = result.get(i - 1);
            List<Integer> current = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                //自己的位置-1,但是左右2边不能越界
                Integer inte1=0;
                Integer inte2=0;
                if ((j-1)>=0) inte1 = pre.get(j-1);//自己的位置
                if(j<=i-1) inte2 = pre.get(j);//自己的位置
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

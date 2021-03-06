package io.github.fairyspace.leetcode.month02.day26;

import java.util.ArrayList;
import java.util.List;

/**
 * ๐๐๐๐๐๐๐๐๐๐๐๐้้ปไธ้ฟ๏ผ่กๅๅฐ่ณ๐๐๐๐๐๐๐๐๐๐๐๐
 * ๐ Program: algorithm
 * ๐ Description:
 * ๐ @author: xuquanru
 * ๐ Create: 2021/8/11
 * ๐๐๐๐๐๐๐๐๐๐๐๐่ก่ไธ่พ๏ผๆชๆฅๅฏๆ๐๐๐๐๐๐๐๐๐๐๐๐
 **/
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i+1<nums.length&&nums[i + 1] - nums[i] == 1) {
                i=i+1;
            }
            int end = nums[i];
            String res = start == end ? String.valueOf(start) : start + "->" + end;
            result.add(res);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> strings = solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        strings.forEach(s -> System.err.println(s));
    }
}


/**
 * ็ปๅฎไธไธชๆ ้ๅคๅ็ด ็ๆๅบๆดๆฐๆฐ็ป nums ใ
 *
 * ่ฟๅ ๆฐๅฅฝ่ฆ็ๆฐ็ปไธญๆๆๆฐๅญ ็ ๆๅฐๆๅบ ๅบ้ด่ๅดๅ่กจใไนๅฐฑๆฏ่ฏด๏ผnums ็ๆฏไธชๅ็ด ้ฝๆฐๅฅฝ่ขซๆไธชๅบ้ด่ๅดๆ่ฆ็๏ผๅนถไธไธๅญๅจๅฑไบๆไธช่ๅดไฝไธๅฑไบ nums ็ๆฐๅญ x ใ
 *
 * ๅ่กจไธญ็ๆฏไธชๅบ้ด่ๅด [a,b] ๅบ่ฏฅๆๅฆไธๆ ผๅผ่พๅบ๏ผ
 *
 * "a->b" ๏ผๅฆๆ a != b
 * "a" ๏ผๅฆๆ a == b
 * ่พๅฅ๏ผnums = [0,1,2,4,5,7]
 * ่พๅบ๏ผ["0->2","4->5","7"]
 */
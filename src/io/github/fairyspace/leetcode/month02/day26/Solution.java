package io.github.fairyspace.leetcode.month02.day26;

import java.util.ArrayList;
import java.util.List;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: algorithm
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2021/8/11
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
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
 * 给定一个无重复元素的有序整数数组 nums 。
 *
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 *
 * 列表中的每个区间范围 [a,b] 应该按如下格式输出：
 *
 * "a->b" ，如果 a != b
 * "a" ，如果 a == b
 * 输入：nums = [0,1,2,4,5,7]
 * 输出：["0->2","4->5","7"]
 */
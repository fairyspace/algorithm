package io.github.fairyspace.leetcode.month02.day22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xuquanru
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.containsDuplicate(new int[]{1, 2, 3, 4, 5});
        System.err.println(b);
    }
}

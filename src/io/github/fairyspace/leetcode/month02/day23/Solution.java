package io.github.fairyspace.leetcode.month02.day23;


import java.util.HashSet;
import java.util.Set;

/**
 * @author xuquanru
 * 给定一个整数数组和一个整数k，判断数组中是否存在两个不同的索引i和j，
 * 使得nums [i] = nums [j]，并且 i 和 j的差的 绝对值 至多为 k。
 */
public class Solution {
    public boolean containsNearbyDuplicate1(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set=new HashSet<>();
            set.add(nums[i]);
            for (int j = 1; j <= k&&i+j<nums.length; j++) {
               if(!set.add(nums[i + j])) return true;
            }
        }

        return false;
    }


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }




    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.containsNearbyDuplicate(new int[]{1,2,3,4,5,1}, 3);
        System.err.println(b);
    }

}

package io.github.fairyspace.leetcode.month01.day20;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-06-30 14:45
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*1,null*/

        if (n == 0) return;

        int[] ints = new int[m+n];
        int left = 0;
        int right = 0;
        int res = 0;

        while (res < m+n) {

            /*ε·¦θΎΉθ§¦εΊ*/
            if (left == m) {
                int j = nums2[right];
                ints[res] = j;
                right++;
                res++;
                continue;
            }

            /*ε³θΎΉθ§¦εΊ*/
            if (right == n) {
                int i = nums1[left];
                ints[res] = i;
                left++;
                res++;
                continue;
            }

            int j = nums2[right];
            int i = nums1[left];
            if (i < j) {
                ints[res] = i;
                left++;
            } else {
                ints[res] = j;
                right++;
            }
            res++;
        }

        for (int i = 0; i < m+n; i++) {
            nums1[i] = ints[i];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;

        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);

        for (int i = 0; i < nums1.length; i++) {
            System.err.println(nums1[i]);
        }
    }
}

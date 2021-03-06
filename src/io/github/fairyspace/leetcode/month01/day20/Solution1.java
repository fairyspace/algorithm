package io.github.fairyspace.leetcode.month01.day20;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-06-30 14:45
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*1,null*/
        int p=m+n-1;
        int left=m-1;
        int right=n-1;

        while (right!=-1&&left!=-1){
            if (nums1[left] < nums2[right]) {
                nums1[p]=nums2[right];
                right--;
                p--;
            }else {
                nums1[p]=nums1[left];
                left--;
                p--;
            }
        }

        while (right != -1) {
            nums1[right] = nums2[right];
            right--;
        }

    }





    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] nums1 = new int[6];
        nums1[0] = 4;
        nums1[1] = 5;
        nums1[2] = 6;

        int[] nums2 = {1, 2, 3};
        solution.merge(nums1, 3, nums2, 3);

        for (int i = 0; i < nums1.length; i++) {
            System.err.println(nums1[i]);
        }
    }
}

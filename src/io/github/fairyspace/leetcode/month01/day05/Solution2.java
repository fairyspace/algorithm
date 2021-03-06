package io.github.fairyspace.leetcode.month01.day05;

/**
 * ๐๐๐๐๐๐๐๐๐๐๐๐้้ปไธ้ฟ๏ผ่กๅๅฐ่ณ๐๐๐๐๐๐๐๐๐๐๐๐
 * ๐ Program: mqdemo
 * ๐ Description
 * ๐ @Author: Stephen
 * ๐ Create: 2021-05-25 15:41
 * ๐๐๐๐๐๐๐๐๐๐๐๐่ก่ไธ่พ๏ผๆชๆฅๅฏๆ๐๐๐๐๐๐๐๐๐๐๐๐
 **/
public class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        //ๅ่ฎพไปๆฏ็ญๆก๏ผๅบ่ฏฅๆฏๆ็ญ็
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(str)) {
              str= str.substring(0, str.length() - 1);
            }
        }

        return str;
    }

    public static void main(String[] args) {
        String[] strings = {"ab", "a"};
        Solution2 solution = new Solution2();
        String s = solution.longestCommonPrefix(strings);
        System.err.println(s);
    }
}

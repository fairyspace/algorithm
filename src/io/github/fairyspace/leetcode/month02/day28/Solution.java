package io.github.fairyspace.leetcode.month02.day28;

/**
 * ๐๐๐๐๐๐๐๐๐๐๐๐้้ปไธ้ฟ๏ผ่กๅๅฐ่ณ๐๐๐๐๐๐๐๐๐๐๐๐
 * ๐ Program: algorithm
 * ๐ Description:
 * <p>
 * ็ปๅฎไธไธชๆญฃๆดๆฐย n ๏ผไฝ ๅฏไปฅๅๅฆไธๆไฝ๏ผ
 * <p>
 * ๅฆๆย nย ๆฏๅถๆฐ๏ผๅ็จย n / 2ๆฟๆขย n ใ
 * ๅฆๆย nย ๆฏๅฅๆฐ๏ผๅๅฏไปฅ็จย n + 1ๆn - 1ๆฟๆขย n ใ
 * nย ๅไธบ 1 ๆ้็ๆๅฐๆฟๆขๆฌกๆฐๆฏๅคๅฐ๏ผ
 * <p>
 * ๆฅๆบ๏ผๅๆฃ๏ผLeetCode๏ผ
 * ้พๆฅ๏ผhttps://leetcode-cn.com/problems/integer-replacement
 * ่ไฝๆๅฝ้ขๆฃ็ฝ็ปๆๆใๅไธ่ฝฌ่ฝฝ่ฏท่็ณปๅฎๆนๆๆ๏ผ้ๅไธ่ฝฌ่ฝฝ่ฏทๆณจๆๅบๅคใ
 * <p>
 * ๐ @author: xuquanru
 * ๐ Create: 2021/11/19
 * ๐๐๐๐๐๐๐๐๐๐๐๐่ก่ไธ่พ๏ผๆชๆฅๅฏๆ๐๐๐๐๐๐๐๐๐๐๐๐
 **/
public class Solution {
    public int integerReplacement2(int n) {
        /*ๅฆๆn=1,็ดๆฅ่ฟๅ็ปๆ*/
        if ((n & 1) == 1) {
            /*ๅฆๆnๆฏๅฅๆฐ๏ผๆๅฎๅๆๅถๆฐ*/
            if ((n & 2) == 0||n==3) {
                n = n - 1;
            } else {
               n=n+1;

            }
        } else {
            /*ๅฆๆnๆฏๅถๆฐ,็งปไธ็ปง็ปญๆไฝ*/
            n = n >>> 1;
        }

        return n;
    }

    public int integerReplacement(int n) {
        if (n == 1) return 0;
        int count = 0;
        while (n != 1) {
            n = integerReplacement2(n);
            count++;
        }

        return count;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.integerReplacement(2147483647);
        System.err.println(i);
    }
}

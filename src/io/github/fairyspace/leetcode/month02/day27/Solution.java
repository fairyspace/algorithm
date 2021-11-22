package io.github.fairyspace.leetcode.month02.day27;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: algorithm
 * 🍁 Description:
 * 🍁 @author: xuquanru
 * 🍁 Create: 2021/8/19
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        int count=0;
        while (n != 0) {
            int i = n & 1;
            if (i == 1) {
                count++;
            }
           n= n>>>1;
        }

        return count==1?true:false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean powerOfTwo = solution.isPowerOfTwo(12);
        System.err.println(powerOfTwo);
    }

    /*
    * 大写变小写、小写变大写：字符 ^= 32 （大写 ^= 32 相当于 +32，小写 ^= 32 相当于 -32）
      大写变小写、小写变小写：字符 |= 32 （大写 |= 32 就相当于+32，小写 |= 32 不变）
      大写变大写、小写变大写：字符 &= -33 （大写 ^= -33 不变，小写 ^= -33 相当于 -32）
    *
    *x &= (x - 1) ------> 把x最低位的二进制1给去掉
    *x&(-x)------------只要最低位的1
    *   将X最右边的n位清零：x & (~0 << n)
        获取x的第n位值：(x >> n) & 1
        获取x的第n位的幂值：x & (1 << n)
        仅将第n位置为1：x | (1 << n)
        仅将第n位置为0：x & (~(1 << n))
        将x最高位至第n位（含）清零：x & ((1 << n) - 1)
        将第n位至第0位（含）清零：x & (~((1 << (n + 1)) - 1))
    *
    * */

}

package io.github.fairyspace.leetcode.month02.day28;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: algorithm
 * 🍁 Description:
 * <p>
 * 给定一个正整数 n ，你可以做如下操作：
 * <p>
 * 如果 n 是偶数，则用 n / 2替换 n 。
 * 如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。
 * n 变为 1 所需的最小替换次数是多少？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-replacement
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 🍁 @author: xuquanru
 * 🍁 Create: 2021/11/19
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public int integerReplacement2(int n) {
        /*如果n=1,直接返回结果*/
        if ((n & 1) == 1) {
            /*如果n是奇数，把它变成偶数*/
            if ((n & 2) == 0||n==3) {
                n = n - 1;
            } else {
               n=n+1;

            }
        } else {
            /*如果n是偶数,移一继续操作*/
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

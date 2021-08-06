package io.github.fairyspace.leetcode.month01.day13;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-11 19:59
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution3 {
    public int lengthOfLastWord(String s) {
        int count=0;
        for (int index = s.length()-1; index >= 0; index--) {
            if(s.charAt(index)!=' '){
                count++;
            }else{
                if(count>0){
                    return count;
                }
            }


        }
        return  count;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int i = solution3.lengthOfLastWord(" ");
        System.err.println(i);
    }
}

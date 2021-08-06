package io.github.fairyspace.leetcode.month01.day04;

import java.util.HashMap;
import java.util.Map;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-24 15:10
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    static int[] asi = new int[]{1000, 500, 100, 50, 10, 5, 1};
    static char[] asschar = new char[]{'M','D','C','L','X','V','I'};
    static Map<Character,Integer> symbolValues=new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int romanToInt(String s) {
        //CXCIX
        int result=0;
        int last=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer value = symbolValues.get(c);
            result=result+value;
            if(value>last){
                result = result - 2 * last;

            }
            last=value;
        }


        return result;
    }


    private static int index(char ch){
        for (int i = 0; i < asschar.length; i++) {
            if (ch==asschar[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int i = romanToInt("MCDXXXVII");
        System.err.println(i);
    }
}


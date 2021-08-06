package io.github.fairyspace.leetcode.month02.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-07-26 15:54
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> result1 = new HashMap(8);
        Map<Character, Character> result2 = new HashMap(8);
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (result1.containsKey(s1)) {
                char o = result1.get(s1);
                if(t1!=o) {
                    return false;
                }
            }else {
                if (result2.containsKey(t1)) {
                    char o = result2.get(t1);
                    if(s1!=o) {
                        return false;
                    }
                }
                result1.put(s1, t1);
                result2.put(t1, s1);
            }
        }

        return true;
    }



    public static void mainA(String args[]) {
        String str = "TKI460+656";
        String str2 = "KU700+656";
      //  String pattern = "[0-9]+\\+[0-9]*";
        String pattern = "([A-Za-z]+|\\+)";
        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(str);
        Matcher matcher2 = r.matcher(str2);
        int i=1;
        while (matcher.find()) {
            System.err.println("Step:"+i);
            System.err.println(matcher.replaceAll(""));
        }
        while (matcher2.find()) {
            System.err.println("Step:"+i);
            System.err.println(matcher2.replaceAll(""));
        }
    }
}

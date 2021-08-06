package io.github.fairyspace.leetcode.month01.day06;

import java.util.Stack;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-05-26 10:35
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean rightSymbol = isRightSymbol(c);
            if(rightSymbol){
                boolean empty = characters.isEmpty();
                if (empty)return false;

                Character pop = characters.pop();
                if(pop!=c){
                   return false;
                }
            }else{
                char other = getOther(c);
                characters.push(other);
            }

        }

        return characters.isEmpty()?true:false;
    }

    private char getOther(char c){
        char character;
        switch (c) {
            case '[' :
                character = ']';break;
            case '{' :
                character = '}';break;
            default:
                character = ')';
        }
        return character;
    }


    private boolean isRightSymbol(char c){
        if(c==')'||c==']'||c=='}'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean valid = solution.isValid("[][");
        System.err.println(valid);
    }
}

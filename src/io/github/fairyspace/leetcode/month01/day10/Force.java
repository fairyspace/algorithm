package io.github.fairyspace.leetcode.month01.day10;

/**
 * ππππππππππππιι»δΈιΏοΌθ‘εε°θ³ππππππππππππ
 * π Program: mqdemo
 * π Description
 * π @Author: Stephen
 * π Create: 2021-05-31 10:31
 * ππππππππππππθ‘θδΈθΎοΌζͺζ₯ε―ζππππππππππππ
 **/
public class Force {
    private boolean isEqual(String a,String b){
        if (a.length()!=b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {

        String source="AAAAAABC";
        String pattern = "AABC";
        Force force = new Force();
        boolean equal = force.isEqual("asd", "asd");
        int i = force.bruteForce(source, pattern);
        System.err.println(i);


    }


    private int bruteForce(String source,String pattern){
        for (int i = 0; i <=source.length()-pattern.length(); i++) {
            String temp = source.substring(i, i+pattern.length());
            boolean equal = isEqual(temp, pattern);
            if(equal){
                return i;
            }
        }

        return -1;
    }

}

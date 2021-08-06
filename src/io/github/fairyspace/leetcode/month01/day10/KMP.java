package io.github.fairyspace.leetcode.month01.day10;

/**
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌道阻且长，行则将至🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 * 🍁 Program: mqdemo
 * 🍁 Description
 * 🍁 @Author: Stephen
 * 🍁 Create: 2021-06-02 18:17
 * 🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌行而不辍，未来可期🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌🐌
 **/
public class KMP {

    private int myKMP(String source,String pattern){
        int[] next = getNext(pattern);
        int spoi=0;
        int ppoi=0;
        //[0,0,1,1,2,3,0]
        // int i = kmp.myKMP("ababaabaabaabac", "abaabac");
        while (spoi<source.length()) {
            if (source.charAt(spoi)==pattern.charAt(ppoi)) {
                spoi++;
                ppoi++;
                if(ppoi==pattern.length()){
                    return spoi-ppoi;
                }
            }else{
                if(ppoi!=0){
                    spoi=spoi-next[ppoi-1];
                }else {
                    spoi=spoi+1;
                }
                ppoi=0;
            }
        }
        return -1;
    }


    private int[] getNext(String pattern){
        //abaabac
        int index=1;
        int[] next =new int[pattern.length()];
        for (int i = 1; i < pattern.length(); i++) {
            if (pattern.charAt(i)==pattern.charAt(0)) {
                next[i]=1;
                int j=i+1;
                while (pattern.charAt(j)==pattern.charAt(index)){
                    next[j]=next[i]+1;
                    j++;
                    i++;
                    index++;
                }
                index=1;
            }else{
                next[i]=0;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        KMP kmp = new KMP();
        int i = kmp.myKMP("ababaabaabaabac", "abaabac");
        //int[] abaabacs = kmp.getNext("abaabac");

        System.err.println(i);
    }




}

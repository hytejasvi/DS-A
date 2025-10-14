package dsa.Day3;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        //System.out.println(minWindow(s, t));
    }

    /*static String minWindow(String s, String t) {
        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> smap = new HashMap<>();
        for(char c: t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0)+1);
        }
        Map<Character, Integer> t2map = tmap;
        *//*for(char c: s.toCharArray()) {
            smap.put(c, smap.getOrDefault(c, 0)+1);
        }*//*
        int left = 0;
        int lc=0, rc=0;
        int windowSize = Integer.MAX_VALUE;
        for(int i=0;i< s.length();i++) {
            if(t2map.containsKey(s.charAt(i))) {
                t2map.put(s.charAt(i), t2map.get(s.charAt(i))-1);
                if(t2map.get(s.charAt(i)) == 0) {
                    t2map.remove(s.charAt(i));
                }
            }

            if(t2map.isEmpty() && i-left+1 <= windowSize) {
                lc = left;
                rc = i;
                windowSize = Math.min(windowSize, i-left+1);
                t2map = tmap;
            }

        }
    }*/
}

package dsa.Day3;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {
    public static void main(String[] args) {
        /*String s = "AAADOBECODEBANC";
        String t = "ABC";*/
        String s = "aaaaa";
        String t = "aa";
        System.out.println(minWindow(s, t));
    }

    static String minWindow(String s, String t) {
        Map<Character, Integer> tmap = new HashMap<>();
        Map<Character, Integer> wmap = new HashMap<>();
        for(char c: t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0)+1);
        }
        int minwin=Integer.MAX_VALUE;
        int[] arr = new int[2];
        int left = 0, i=0, formed =0;
        while(i< s.length()) {
            char c = s.charAt(i);
            if(tmap.containsKey(c)) {
                wmap.put(c, wmap.getOrDefault(c, 0)+1);
                if (wmap.get(c).intValue() == tmap.get(c).intValue()) {
                    formed++;
                }
            }
            while(formed == tmap.size()) {
                if((i-left+1) < minwin) {
                    minwin = i - left + 1;
                    arr[0] = left;
                    arr[1] = i;
                }
                char leftChar = s.charAt(left);
                if (tmap.containsKey(leftChar)) {
                    wmap.put(leftChar, wmap.get(leftChar) - 1);
                    if (wmap.get(leftChar) < tmap.get(leftChar)) {
                        formed--;
                    }
                }
                left++;
            }
            i++;
        }
        return minwin == Integer.MAX_VALUE ? "" : s.substring(arr[0], arr[1] + 1);
    }
}

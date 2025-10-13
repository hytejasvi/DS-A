package dsa.Day2;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
     String s = "AABABBA";
     int k = 1;
     int res = characterReplacement(s, k);
     System.out.println(res);
    }

    private static int characterReplacement(String s, int k) {
        if(s.length() ==1) {
            return 1;
        }
        int left = 0;
        int maxCharacter = 0;
        int res = 0;
        Map<Character, Integer> mm = new HashMap<>();
        for(int i=0;i< s.length();i++) {
            char c = s.charAt(i);
            mm.put(c, mm.getOrDefault(c, 0)+1);
            maxCharacter = Math.max(maxCharacter, mm.get(c));
            while((i-left+1) - maxCharacter > k ) {
                char l = s.charAt(left);
                mm.put(l, mm.get(l)-1);
                if(mm.get(l) == 0) {
                    mm.remove(l);
                }
                left++;
            }
            res = Math.max(res, i-left+1);
        }
        return res;
    }
}

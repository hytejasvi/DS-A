package dsa.Day3;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
    }

    static int lengthOfLongestSubstring(String s) {
        Set<Character> ms = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int i=0;i< s.length();i++) {
            char c = s.charAt(i);
            while(ms.contains(c)) {
                ms.remove(s.charAt(left));
                left++;
            }
            ms.add(c);
            maxLength = Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }
}

package TwoPointers;

import java.util.Arrays;

public class Assign_Cookies {
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        int contentChildren = findContentChildren(g, s);
        System.out.println(contentChildren);
    }

    private static int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        int left = 0, right = 0;
        while(left < g.length && right < s.length) {
            if(g[left] <= s[right]) {
                res++;
                left++;
            }
            right++;
        }
        return res;
    }
}

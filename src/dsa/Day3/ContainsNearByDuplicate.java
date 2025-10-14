package dsa.Day3;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearByDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int val = nums[i];
            if(mm.containsKey(val) && i- mm.get(val) <= k) {
                return true;
            }
            mm.put(val, i);
        }
        return false;
    }
}

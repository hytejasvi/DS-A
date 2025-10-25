package dsa.Day12;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int res = longestConsecutive(nums);
        System.out.println(res);
    }

    //truely optimized solution:
    //as we iterate over the set and not the initial array, we save TC
    private static int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        if(nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return 1;
        }
        for(int i: nums) {
            mySet.add(i);
        } //O(n) TC
        int maxCount = 0;

        for(int n : mySet) {
            if(!mySet.contains(n-1)) {
                int count = 1;
                int k = n;
                while(mySet.contains(k+1)) {
                    count++;
                    k++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }

    private static int longestConsecutive2(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        if(nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return 1;
        }
        for(int i: nums) {
            mySet.add(i);
        } //O(n) TC
        int maxCount = 0;

        for (int num : nums) {
            int count = 1;
            int j = num;
            if(!mySet.contains(j-1)) {
                while (mySet.contains(j + 1)) {
                    count++;
                    j++;
                }
            }

            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}

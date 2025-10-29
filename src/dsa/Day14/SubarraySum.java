package dsa.Day14;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);  // Important: empty subarray has sum 0

        for (int num : nums) {
            prefixSum += num;

            // Check if (prefixSum - k) exists in map
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }

            // Update the count of current prefixSum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,7,-2,2,1,4,2};
        int k = 7;
        int count = subarraySum(nums, k);
        System.out.println(count);
    }
}

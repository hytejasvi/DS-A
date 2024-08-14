import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main (String []args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> x = threeSum(nums);
        System.out.println("returned value: " + x);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Step 1: Sort the array
        for (int i=0;i<nums.length;i++) {
            for (int j=0;j<nums.length-1;j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        // Step 2: Traverse the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Use two pointers to find the other two numbers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Move the left pointer to the right while skipping duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Move the right pointer to the left while skipping duplicates
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    // Move pointers to the next elements
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}

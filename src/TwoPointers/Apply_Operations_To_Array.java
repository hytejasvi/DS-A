package TwoPointers;

import java.util.Arrays;

public class Apply_Operations_To_Array {
    public static void main(String[] args) {
        int[] nums = {312,312,436,892,0,0,528,0,686,516,0,0,0,0,0,445,445,445,445,445,445,984,984,984,0,0,0,0,168,0,0,647,41,203,203,241,241,0,628,628,0,875,875,0,0,0,803,803,54,54,852,0,0,0,958,195,590,300,126,0,0,523,523};
        int[] res = applyOperations(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] applyOperations(int[] nums) {
        for(int i=0;i< nums.length-1;i++) {
            if(nums[i] == nums[i+1]) {
                nums[i] = nums[i] *2;
                nums[i+1] = 0;
            }
        }

        int[] res = new int[nums.length];
        int left = 0;
        for (int num : nums) {
            if (num != 0) {
                res[left] = num;
                left++;
            }
        }
        return res;
    }
}

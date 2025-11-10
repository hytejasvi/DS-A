package TwoPointers;

import java.util.Arrays;

public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] res = sortArrayByParity(nums);
        System.out.println(Arrays.toString(res));
    }

    private static int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) {
            return nums;
        }
        int[] res = new int[nums.length];
        int even = 0, odd = nums.length-1;
        for(int i=0;i< nums.length;i++) {
            if(nums[i]%2 == 0) {
                res[even] = nums[i];
                even ++;
            } else {
                res[odd] = nums[i];
                odd--;
            }
        }
        return res;
    }
}

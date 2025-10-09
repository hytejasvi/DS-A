package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length ==1) {
            return res;
        }
        for(int i=0;i< nums.length;i++) {
            int n = Math.abs(nums[i]);
            if(nums[n-1] < 0) {
                res.add(n);
            } else {
                nums[n-1] = nums[n-1] * -1;
            }
            System.out.println(Arrays.toString(nums));
        }
        return res;
    }
}

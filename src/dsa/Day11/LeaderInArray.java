package dsa.Day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {

    public static List<Integer> leaders(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length ==1) {
            res.add(nums[0]);
            return res;
        }
        int n = nums.length;
        int max = nums[n-1];
        res.add(max);
        for(int i = n-2;i>=0;i--) {
            if(nums[i] > max) {
                max = nums[i];
                res.add(max);
            }
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        List<Integer> res = leaders(nums);
        System.out.println(res);
    }
}

package dsa.Day2;

import java.util.regex.Matcher;

public class MaxAverage {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        //int[] nums = {-1};
        //int k = 1;
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;
        for(int i=0;i<k;i++) {
            windowSum = windowSum+nums[i];
        }
        int maxSum = windowSum;
        int left = 0;
        for(int i=k;i< nums.length;i++) {
            windowSum = windowSum+nums[i]-nums[left];
            maxSum = Math.max(maxSum, windowSum);
            left++;
        }
        return maxSum/(double)k;
        /*
        int maxSum = 0;
        double maxAvg = -Double.MAX_VALUE;
        double windowSum = 0.0;
        for(int i=0;i<k;i++) {
            windowSum = windowSum+nums[i];
        }
        double avg=(windowSum)/(double)k;

        maxAvg = Math.max(maxAvg, avg);
        int left=0;
        for(int i=k;i< nums.length;i++) {
            windowSum = windowSum + nums[i] - nums[left];
            avg = (windowSum)/(double)k;
            maxAvg = Math.max(maxAvg, avg);
            left++;
        }
        return maxAvg;*/
    }
}

package dsa.Day10;

import java.util.Arrays;

public class MaximumSubArrayWindow {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        //int[] arr = {-2, -3, -7, -1, -10, -4};
        int[] res = maxSubArrayWindow(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] maxSubArrayWindow(int[] arr) {
        int[] res = new int[2];
        int left = 0, right = -1;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++) {
            currentSum = currentSum+arr[i];
            right++;
            if(currentSum > maxSum) {
                maxSum = currentSum;
                res[0] = left;
                res[1] = right;
            }
            if(currentSum <0) {
                currentSum=0;
                left = i+1;
            }
        }
        return res;
    }
}

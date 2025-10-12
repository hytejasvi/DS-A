package dsa.Day1;

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[]arr = {-1,0};
        int target = -1;
        int[] res = twoSumSorted(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSumSorted(int[] arr, int target) {
        if(arr.length < 2) {
            return new int[]{-1,-1};
        }
        int[] res = new int[2];
        int left = 0, right = arr.length-1;
        while(left < right) {
            if(arr[left] + arr[right] == target) {
                res[0] = left+1;
                res[1] = right+1;
                break;
            } else if(arr[left] + arr[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }
}

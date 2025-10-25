package dsa.Day11;

import java.util.Arrays;

public class PreviousPermutation {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4};
        previousPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void previousPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;
        for(int i=n-2;i >=0;i--) {
            if(nums[i] > nums[i+1]) {
                pivot = i;
                break;
            }
        }
        if(pivot == -1) {
            int left = 0, right = n-1;
            while(left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
            return;
        }
        for(int i = n-1;i> pivot;i--) {
            if(nums[i] < nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }
        int left = pivot+1, right = n-1;
        while(left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

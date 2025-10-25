package dsa.Day11;

import java.util.Arrays;

/*
    Find the pivot → traverse from right, find the first index i where nums[i] < nums[i+1].
        (this marks where the descending order breaks)
    If no pivot found → array is in descending order → reverse entire array.
    Find the next greater element to nums[pivot] from the right end and swap them.
    Reverse the subarray after the pivot (pivot+1 → end) to get the smallest arrangement.
*/
public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        //int[] arr = {100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void nextPermutation(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        for(int i= n-2;i>=0;i--) {
            if(arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }
        if(pivot == -1) {
            int left = 0, right = n-1;
            while(left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
            return;
        }
        for(int i = n-1; i> pivot;i--) {
            if(arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }
        int left = pivot+1, right = n-1;
        while(left <= right) {
            swap(arr, left, right);
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

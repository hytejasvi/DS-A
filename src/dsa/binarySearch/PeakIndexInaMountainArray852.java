package dsa.binarySearch;

import java.util.Arrays;

public class PeakIndexInaMountainArray852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(arr[mid] < arr[mid+1]) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2};
        int res = peakIndexInMountainArray(arr);
        System.out.println(res);
    }
}

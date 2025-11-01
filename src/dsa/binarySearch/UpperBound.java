package dsa.binarySearch;

public class UpperBound {
    public static int upperBound(int[] nums, int x) {
        int res = 0;
        int left = 0, right = nums.length-1;
        while(left <= right) {
            int mid = (right+left)/2;
            if(nums[mid] <= x) {
                left = mid+1;
            } else {
                res = mid;
                right = mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        int x=9;
        System.out.println(upperBound(nums, x));
    }
}

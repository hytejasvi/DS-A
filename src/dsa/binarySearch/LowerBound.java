package dsa.binarySearch;

public class LowerBound {
    public static int lowerBound(int[] nums, int x) {
        int res = 0;
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = (right+left)/2;
            if(nums[mid] >= x) {
                res = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int x= 2;
        System.out.println(lowerBound(nums, x));
    }
}

package dsa.binarySearch;

public class SearchInRotatedArray {
    private static int search(int[] nums, int target) {
        if(nums.length==1) {
            return nums[0] == target ? 0: -1;
        }
        int pivot;
        if(nums[0] < nums[nums.length-1]) {
            pivot = -1;
        } else {
            pivot = findPivot(nums);
        }
        int index;
        if(pivot==-1) {//array is not rotated or it is rotated 2*len times that the original array is formed
            index = searchElement(nums, 0, nums.length-1, target);
        } else { //when array is rotated by some value
            index = searchElement(nums, 0, pivot-1, target);
            if(index == -1) {
                index = searchElement(nums, pivot, nums.length-1, target);
            }
        }
        return index;
    }

    private static int searchElement(int[] nums, int left, int right, int target) {
        boolean isAsc;
        isAsc = nums[left] < nums[right];
        while(left <= right) {
            int mid = (right+left)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if(nums[mid] < target) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            } else {
                if(nums[mid] < target) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }

    private static int findPivot(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right) {
            int mid = (right+left)/2;
            if(nums[mid] > nums[right]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        System.out.println(left);
        return left;
    }

    public static void main(String[] args) {
        //int[] nums ={4,5,6,7,0,1};
        //int[] nums ={1,2,3,4,5,6,7};
        //int[] nums ={3,2,1};
        int[] nums ={5,4,3,2,1};
        int target = 21;
        int res = search(nums, target);
        System.out.println(res);
    }
}

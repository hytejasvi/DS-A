package Arrays;

/*Given an integer array nums sorted in non-decreasing order,
 return an array of the squares of each number sorted in non-decreasing order.*/

public class SquareOfSortedArray {
    public static void main (String [] args) {
        int[] nums = {-4,-1,0,3,10};
        for (int i=0;i<nums.length;i++) {
            nums[i] = nums[i] * nums[i];
        }
        int n = nums.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

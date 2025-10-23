package dsa.Day9;

public class CheckIfSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        boolean res = check(nums);
        System.out.println(res);
    }

    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++) {
            System.out.println(nums[i] +" : "+ nums[(i+1) % n]);
            if(nums[i] > nums[(i+1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}

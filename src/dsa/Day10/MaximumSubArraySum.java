package dsa.Day10;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        //int[] arr = {2, 3, 5, -2, 7, -4};
        int[] arr = {-2, -3, -7, -2, -10, -4};
        int res = maxSubArray(arr);
        System.out.println(res);
    }

    private static int maxSubArray(int[] arr) {
        if(arr.length<1) {
            return 0;
        }
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int j : arr) {
            currentSum = currentSum + j;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}

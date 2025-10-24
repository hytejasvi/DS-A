package dsa.Day10;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        //int[] arr = {3,1,-2,-5,2,-4};
        int[] arr = {-1,1};
        int[] res = rearrangeArray(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] rearrangeArray(int[] arr) {
        int pos = 0;
        int neg = 1;
        int[] res = new int[arr.length];
        for (int temp : arr) {
            if (temp >= 0) {
                res[pos] = temp;
                pos = pos + 2;
            } else {
                res[neg] = temp;
                neg = neg + 2;
            }
        }
        return res;
    }
}

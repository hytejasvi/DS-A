package dsa.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[ ]arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> res =  threeSum(arr);
        System.out.println(res);
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            if(i >0 && arr[i] == arr[i-1]) {
                continue;
            }
            int left = i+1, right = arr.length-1;
            while(left < right) {
                int currentSum = arr[left] + arr[right]+ arr[i];
                if(currentSum > 0) {
                    right --;
                } else if(currentSum < 0) {
                    left++;
                } else {
                    res.add(Arrays.asList(arr[left] , arr[right] , arr[i]));

                    while(left < right && arr[left] == arr[left+1]) {
                        left++;
                    }
                    while(left < right && arr[right] == arr[right-1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}

package dsa.Day1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] arr, int target) {
        if(arr.length < 2) {
            return new int[] {-1, -1};
        }
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i=0;i < arr.length;i++) {
            if(myMap.containsKey(target - arr[i])) {
                return new int[] {myMap.get(target - arr[i]), i};
            } else {
                myMap.putIfAbsent(arr[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}

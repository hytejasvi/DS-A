package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Two_2D_Arrays_by_Summing_Values {
    private static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int left = 0, right=0;
        List<int[]> mergedArray = new ArrayList<>();
        while(left < nums1.length && right < nums2.length) {
            if(nums1[left][0] == nums2[right][0]) {
                mergedArray.add(new int[] {nums1[left][0], nums1[left][1] + nums2[right][1]});
                left++;
                right++;
            } else if(nums1[left][0] < nums2[right][0]) {
                mergedArray.add(new int[] {nums1[left][0], nums1[left][1]});
                left++;
            } else {
                mergedArray.add(new int[] {nums2[right][0], nums2[right][1]});
                right++;
            }
        }
        while(left < nums1.length) {
            mergedArray.add(new int[] {nums1[left][0], nums1[left][1]});
            left++;
        }
        while(right < nums2.length) {
            mergedArray.add(new int[] {nums2[right][0], nums2[right][1]});
            right++;
        }
        int[][] res = new int[mergedArray.size()][2];
        for(int i=0;i< mergedArray.size();i++) {
            for(int j=0;j < 2;j++) {
                res[i][j] = mergedArray.get(i)[j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};
        int[][] res = mergeArrays(nums1, nums2);
        for (int[] re : res) {
            for (int i : re) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


}

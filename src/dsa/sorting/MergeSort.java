package dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Merge Sort --> Divide and Conquer algorithm that recursively splits and merges.
* The idea:
*   - Continuously divide the array into two halves until each subarray has only one element.
*   - Then, merge those subarrays back together in sorted order.
*
* Working:
*   1. Divide → Recursively split the array into two halves using mid = (start + end) / 2.
*   2. Conquer → Recursively sort each half.
*   3. Combine → Merge the two sorted halves into a single sorted segment.
*
* Each recursive call handles its own subarray (defined by start, mid, end),
* but all operate on the same original array.
* Once both left and right halves are sorted, the merge() function combines them.
*
* Example:
*   [13, 46, 24, 52]
*   → Split into [13,46] and [24,52]
*   → Sort each half
*   → Merge → [13,24,46,52]
*
* Merge logic:
*   - Use two pointers (left, right) for both halves.
*   - Compare elements and add the smaller one to a temporary list.
*   - Copy merged elements back into the original array segment.
*
* TC: O(n log n)
*   - log n levels of recursion (each split divides array in half)
*   - n work per level (merging takes linear time)
*
* SC: O(n)
*   - Temporary list used for merging at each level.
*
* Stability: Stable (preserves relative order of equal elements)
*
* Behavior:
*   - Excellent for large datasets.
*   - Works well on linked lists and external sorting (like files).
*   - Deterministic and consistent performance (O(n log n) in all cases).
*/

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52};//,20,9};
        //int[] arr = {9, 13, 20, 24, 46, 52};
       mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = (end + start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();
        int left = start;
        int right = mid+1;
        while(left <= mid && right <= end) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while(right <= end) {
            temp.add(arr[right]);
            right++;
        }
        for(int i=start;i<= end;i++) {
            arr[i] = temp.get(i-start);
        }
    }

}

package dsa.sorting;

import java.util.Arrays;
/*
Insertion Sort --> builds the sorted array one element at a time.
* The idea: after each iteration, the left part (0 to i) of the array is sorted.
* Outer loop (i): picks each element one by one.
* Inner loop (j): compares the picked element with all previous elements (0 to i-1),
  and places it in the correct position by swapping or shifting.
*
* For every iteration of i, elements before i are guaranteed to be sorted.
*
* TC: O(n^2) --> nested loops in worst and average cases
* SC: O(1) --> in-place sorting
* Best Case: O(n) --> already sorted array (only one pass, no swaps)
*
* Behavior: works efficiently for small or partially sorted arrays.
*/

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        //int[] arr = {9, 13, 20, 24, 46, 52};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=0;i< arr.length;i++) {
            int j=i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}

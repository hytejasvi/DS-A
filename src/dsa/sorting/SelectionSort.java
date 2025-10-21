package dsa.sorting;

import java.util.Arrays;
/*
Selection Sort --> select teh maximum element, place it in the end and move on doing the same.
* The idea here is to run a loop for the elements of the array (with pointer i)
* then run another loop within (ex:j) which starts from i+1
* now, each iteration we first get the maximum element
* then swap the maximum element to the last position or arr.length-i-1 pos
* so each iteration we would successfully place the maximum element in that iteration to the end of the array
* TC: O(n^2) --> 2 loops for each iteration of i, j goes for n-i items
* SC: O(1) --> no additional space
* */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i=arr.length-1;i > 0;i--) {
            int temp = i;
            for(int j=i-1;j>=0;j--) {
                if(arr[j] > arr[temp]) {
                    temp = j;
                }
            }
            int x = arr[temp];
            arr[temp] = arr[i];
            arr[i] = x;
        }
    }
}

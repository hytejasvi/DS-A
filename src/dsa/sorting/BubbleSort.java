package dsa.sorting;

import java.util.Arrays;
/*
Bubble Sort --> repeatedly swap adjacent elements if they are in the wrong order.
* The idea is to push (or "bubble") the largest element to the end in each iteration.
* Outer loop (i): controls how many passes to make (each pass places one element correctly at the end)
* Inner loop (j): compares adjacent elements arr[j] and arr[j+1]
* If arr[j] > arr[j+1], swap them
* After each pass, the last i elements are sorted
*
* TC: O(n^2) --> two nested loops (worst and average case)
* SC: O(1) --> sorting is done in-place
*
* Optimization: use a 'swapped' flag; if no swap occurs in a pass, the array is already sorted --> O(n) best case
*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        //int[] arr = {9, 13, 20, 24, 11, 52};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for(int i = arr.length-1;i >0;i--) {
            boolean swapped = false;
            for(int j=0;j<i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}

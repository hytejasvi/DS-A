package dsa.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 13, 20, 24, 46, 52};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, 0,pivotIndex-1); //--> left
        quickSort(arr, pivotIndex, end); //--> right
    }

    private static int partition(int[] arr, int start, int end) {
        int index = 0;
        int pivot = arr[end];
        for(int i=start;i<end;i++) {
            if(arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = pivot;
        arr[end] = arr[index];
        arr[index] = temp;
        return index;
    }
}

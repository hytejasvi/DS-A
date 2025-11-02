package dsa.binarySearch;

public class CountOccurrencesInASortedArray {
    private static int count(int[] arr, int x) {
        int n = arr.length;
        int mid = (n-1)/2;
        int first = firstOccurrence(arr, 0, mid, x);
        int last = LastOccurrence(arr, mid+1, n-1, x);
        return (last - first +1);
    }

    private static int firstOccurrence(int[] arr, int left, int right, int x) {
        int res = -1;
        while(left <= right) {
            int mid = (right+left)/2;
            if(arr[mid] ==x) {
                res = mid;
                right = mid-1;
            } else if(arr[mid] > x) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return res;
    }

    private static int LastOccurrence(int[] arr, int left, int right, int x) {
        int res = -1;
        while(left <= right) {
            int mid = (right+left)/2;
            if(arr[mid] ==x) {
                res = mid;
                left = mid+1;
            } else if(arr[mid] < x) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int[] arr =  {5, 5, 5, 5, 5, 5};
        int x = 5;
        int ans = count(arr, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}

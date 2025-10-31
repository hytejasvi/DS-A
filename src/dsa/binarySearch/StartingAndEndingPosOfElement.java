package dsa.binarySearch;

public class StartingAndEndingPosOfElement {
    private static int[] searchRange(int[] arr, int x) {
        int i = findStartingPos(arr, x);
        int j = findEndingPos(arr, x);
        return new int[] {i,j};
    }

    private static int findStartingPos(int[] arr, int x) {
        int res = -1;
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = (right+left)/2;
            if(arr[mid] == x) {
                res = mid;
                right = mid-1;
            }else if(arr[mid] > x) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return res;
    }

    private static int findEndingPos(int[] arr, int x) {
        int res = -1;
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = (right+left)/2;
            if(arr[mid] == x) {
                res = mid;
                left = mid+1;
            }else if(arr[mid] < x) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 8,8,10};
        int x = 8;
        int[] ans = searchRange(arr, x);
        System.out.println(ans[0] + " "+ ans[1]);
    }
}

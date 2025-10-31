package dsa.binarySearch;

public class FloorAndCeiling {
    private static int[] getFloorAndCeil(int[] arr, int x) {
        int i = findFloorValue(arr, x);
        int j = findCeilValue(arr, x);

        return new int[]{i,j};
    }

    private static int findFloorValue(int[] arr, int x) {
        int res = -1;
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = (right+left) /2;
            if(arr[mid] <= x) {
                res = arr[mid];
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return res;
    }

    private static int findCeilValue(int[] arr, int x) {
        int res = -1;
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = (right+left) /2;
            if(arr[mid] >= x) {
                res = arr[mid];
                right = mid-1;

            } else {
                left = mid+1;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] ans = getFloorAndCeil(arr, x);
        System.out.println("The floor and ceil are: " + ans[0]
                + " " + ans[1]);
    }
}

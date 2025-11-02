package dsa.binarySearch;

public class FindPeak {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,1,3,5,6,4};
        int[] arr3 = {5,4,3,2,1};
        int index1 = findPeak(arr1);
        System.out.println(index1 +" : "+arr1[index1]);
        int index2 = findPeak(arr2);
        System.out.println(index2 +" : "+arr2[index2]);
        int index3 = findPeak(arr3);
        System.out.println(index3 +" : "+arr3[index3]);
    }

    private static int findPeak(int[] arr) {
        if(arr.length == 1) {
            return 0;
        }
        int left = 0, right = arr.length-1;
        while(left < right) {
            int mid = left + (right-left)/2;
            if(mid == arr.length-1) {
                return arr.length-1;
            }
            if(arr[mid] < arr[mid+1]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

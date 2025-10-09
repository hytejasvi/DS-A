package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*int[] arr = {1,1,2,2,2,3,4,4,5};
        System.out.println(remove(arr));
        int[] arr = {};
        System.out.println(remove(arr));
        int[] arr = {1,1,1,1,1,1};
        System.out.println(remove(arr));*/
        int[] arr = {1,1,1,1,1,1,1,1,5};
        System.out.println(remove(arr));
        /*int[] arr = {1,1,2,2,2,3,4,4,5};
        System.out.println(remove(arr));*/
    }

    static int remove(int[] arr) {
        int n = arr.length;
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        int counter = 0;
        int left = 0, right = 1;
        while(right < n) {
            if(arr[left] != arr[right]) {
                arr[++left] = arr[right];
                counter++;
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));
        return counter+1;
    }
}

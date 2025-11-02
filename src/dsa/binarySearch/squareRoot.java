package dsa.binarySearch;

public class squareRoot {
    public static void main(String[] args) {
        int n = 10000;
        int sqrt = mySqrt(n);
        System.out.println(sqrt);
    }

    private static int mySqrt(int n) {
        if(n < 4) {
            return 1;
        }
        int left = 1, right = n;
        int res = 0;
        while(left <= right) {
            int mid = left+ (right-left)/2;
            if(mid <= n/mid) {
                res = Math.max(res, mid);
                left = mid+1;
            } else if( mid*mid > n) {
                right = mid-1;
            }
        }
        return res;
    }
}

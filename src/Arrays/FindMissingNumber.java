package Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {6,4,2,1,3,5};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = n * (n+1)/2;
        int arraySum = 0;
        for(int x: arr) {
            arraySum += x;
        }
        return sum-arraySum;
    }
}

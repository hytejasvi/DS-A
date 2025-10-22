package dsa.Day8;

public class NnumbersSum {
    public static void main(String[] args) {
        int n = 4;
        int res = nNumbersSum(n);
        System.out.println(res);
    }

    private static int nNumbersSum(int n) {
        if(n < 1) {
            return 0;
        }
        return n + nNumbersSum(n-1);
    }
}

package dsa.Day8;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int fact = factorialWithRecursion(n);
        System.out.println(fact);
    }

    private static int factorialWithRecursion(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * factorialWithRecursion(n-1);
    }
}

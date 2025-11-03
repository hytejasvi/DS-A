package dsa.binarySearch;

public class GuessNumber {
    public static void main(String[] args) {
        int n = 100;
        int guessNumber1 = 10;
        int guessNumber2 = 100;
        int guessNumber3 = 1000;
        int res = guess(n, guessNumber1);
        int res2 = guess(n, guessNumber2);
        int res3 = guess(n, guessNumber3);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }

    private static int guess(int n, int guessNumber) {
        return Integer.compare(guessNumber, n);
    }
}

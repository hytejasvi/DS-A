package dsa.Day7;

public class InvertedStarPyramid {
    public static void main(String[] args) {
        int n = 3;
        invertedStarPyramid(n);
    }

    private static void invertedStarPyramid(int n) {
        for(int i=n;i>0;i--) {
            for(int j=0;j<=n-i-1;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)-1;j++) {
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

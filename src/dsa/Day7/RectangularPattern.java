package dsa.Day7;

public class RectangularPattern {
    public static void main(String[] args) {
        int n = 5; // number of rows and col
        printStarPattern(n);
    }

    private static void printStarPattern(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j < n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

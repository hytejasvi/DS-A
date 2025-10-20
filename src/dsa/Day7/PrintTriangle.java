package dsa.Day7;

public class PrintTriangle {
    public static void main(String[] args) {
        int n = 5;
        printTriangleStar(n);
        printTriangleNumbers(n);
        printTriangleSameNumbers(n);
        printInvertedTriangleStar(n);
        printInvertedTriangleNumbers(n);
    }

    private static void printInvertedTriangleNumbers(int n) {
        for(int i=n;i>0;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void printInvertedTriangleStar(int n) {
        for(int i=n;i>0;i--) {
            for(int j=i;j >0;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printTriangleSameNumbers(int n) {
        for(int i=1;i<= n;i++) {
            for(int j=1;j<= i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void printTriangleNumbers(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void printTriangleStar(int n) {
        for(int i=0;i< n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package dsa.Day8;

public class BasicRecursion {
    public static void main(String[] args) {
        int n = 3;
        String name = "Tejas";
        //printNames(name, n);
        //printNumbersTillN(n);
        printNumbersFromNTill1(n);
    }

    private static void printNumbersFromNTill1(int n) {
        if(n<1) {
            return;
        }
        System.out.println(n);
        printNumbersFromNTill1(n-1);
    }

    private static void printNumbersTillN(int n) {
        if(n < 1) {
            return;
        }
        printNumbersTillN(n-1);
        System.out.println(n);
    }

    private static void printNames(String name, int n) {
        if(n<=0) {
            return;
        }
        System.out.println(name);
        printNames(name, n-1);
    }
}

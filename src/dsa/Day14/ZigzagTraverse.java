package dsa.Day14;

import java.util.*;

public class ZigzagTraverse {

    public static Map<Integer, Integer> zigzagTraverseAndPrimes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r=0;
        int c=0;
        List<Integer> myList = new ArrayList<>(rows*cols);
        String direction = "right";
        for(int i=0;i <rows*cols;i++) {
            if(direction.equals("right")) {
                if(c < cols-1) {
                    myList.add(matrix[r][c]);
                    c++;
                } else if (c == cols-1) {
                    myList.add(matrix[r][c]);
                    r++;
                    direction = "left";
                }
            } else {
                if(c >0) {
                    myList.add(matrix[r][c]);
                    c--;
                } else if(c==0) {
                    myList.add(matrix[r][c]);
                    r++;
                    direction = "right";
                }
            }
        }
        System.out.println(myList);
        return new HashMap<>();
    }

    private static boolean isPrime(int n) {
        for(int i=2; i<= n/2;i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 11, 4, 3},
                {6, 7, 15, 13},
                {8, 14, 1, 2},
                {5, 9, 12, 19}
        };
        zigzagTraverseAndPrimes(matrix);
    }
}

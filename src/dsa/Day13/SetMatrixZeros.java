package dsa.Day13;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1}, {0, 1, 1}, {1, 1, 1}};
        int[][] matrix2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] m3 = {{1,2}, {3,4},{5,6}};
        int rows = m3.length;
        int cols = m3[0].length;
        System.out.println("rows: "+rows);
        System.out.println("column: "+cols);
        /*System.out.println("before transformation: ");
        for(int[] i: matrix) {
            for (int j: i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //setZeroesUsingAdditionalSpace(matrix);
        setZeroes(matrix);
        System.out.println("After transformation: ");
        for(int[] i: matrix) {
            for (int j: i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
    }

    //SC: O(1) : no additional space being used
    //TC: O(mn) : iterating the given matrix 2 times
    private static void setZeroes(int[][] matrix) {
        boolean firstColumnImpacted = false;
        boolean firstRowImpacted = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i< rows;i++) {
            if(matrix[i][0] == 0) {
                firstRowImpacted = true;
                break;
            }
        }
        for(int j=0;j<cols;j++) {
            if(matrix[0][j] == 0) {
                firstColumnImpacted = true;
                break;
            }
        }

        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j < matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i< matrix.length;i++) {
            for(int j=1;j < matrix[i].length;j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowImpacted) {
            for(int i=0;i< rows;i++) {
                matrix[i][0] = 0;
            }
        }
        if(firstColumnImpacted) {
            for(int j=0;j< cols;j++) {
                matrix[0][j] = 0;
            }
        }
    }



    //SC: O(m+n) : for the additional boolean arrays we use
    //TC: O(mn) : m*n for first time iteration, and m*n for filling up --> O(2m*n) --> O(mn)
    public static void setZeroesUsingAdditionalSpace(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j < matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    column[j] = true;
                }
            }
        }
        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j < matrix[i].length;j++) {
                if(rows[i] || column[j]) {//rows[i] == true || column[j] == true
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

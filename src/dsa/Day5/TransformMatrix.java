package dsa.Day5;

import java.util.Arrays;

public class TransformMatrix {
    public static void main(String[] args) {
        // Initial matrix (2D array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Call our function on the matrix and output the result
        int[][] transposed = transformMatrix(matrix);
        for (int[] row : transposed) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transformMatrix(int[][] matrix) {

        int[][] newMat = new int[matrix[0].length][matrix.length];
        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                newMat[j][i] = matrix[i][j];
            }
        }
        return newMat;
    }
}

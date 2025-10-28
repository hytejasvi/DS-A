package dsa.Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagPatternTrraversal {

    public static List<int[]> solution(int[][] matrix) {
        List<int[]> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0, col = 0;
        boolean up = true;

        // Traverse all elements
        for (int i = 0; i < rows * cols; i++) {
            // Process current element
            if (matrix[row][col] < 0) {
                res.add(new int[]{row, col});
            }

            // Determine next position
            if (up) {
                if (col == cols - 1) {
                    row++;
                    up = false;
                } else if (row == 0) {
                    col++;
                    up = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == rows - 1) {
                    col++;
                    up = true;
                } else if (col == 0) {
                    row++;
                    up = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][]  matrix = {{1, -2, 3, -4},
                {5, -6, 7, 8},
                {-9, 10, -11, 12}};
        List<int[]> res = solution(matrix);
        for(int[] x: res){
            System.out.println(Arrays.toString(x));
        }
    }
}

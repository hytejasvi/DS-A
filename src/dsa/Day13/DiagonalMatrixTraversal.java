package dsa.Day13;

import java.util.ArrayList;
import java.util.List;

public class DiagonalMatrixTraversal {

    public static List<Integer> diagonalTraverseAndSquares(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0, c=0;
        int direction = 1; // 1--bottom + left   && -1 --> top right
        for(int i=0;i < rows*cols;i++) {
            elements.add(matrix[r][c]);
            if(direction == 1) {
                if(r == rows-1) {
                    c = c+1;
                    direction = -1;
                } else if(c == 0) {
                    r = r+1;
                    direction = -1;
                } else {
                    r = r+1;
                    c = c-1;
                }
            } else {
                if(c == cols-1) {
                    r = r+1;
                    direction = 1;
                } else if(r==0) {
                    c= c+1;
                    direction = 1;
                } else {
                    r = r-1;
                    c = c+1;
                }
            }
        }
        for (int idx = 0; idx < elements.size(); ++idx) {
            int val = elements.get(idx);
            int root = (int) Math.sqrt(val);
            if (root * root == val) {  // Check if the value is a perfect square number.
                res.add(idx);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        List<Integer> res =  diagonalTraverseAndSquares(matrix);
        System.out.println(res);
    }


}

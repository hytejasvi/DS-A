package dsa.Day5;

public class TransformMatrix {
    public static void main(String[] args) {
        // Initial matrix (2D array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Call our function on the matrix and output the result
        int[][] transposed = transformMatrix(matrix);
        /*for (int[] row : transposed) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }*/
    }

    public static int[][] transformMatrix(int[][] matrix) {
        //System.out.println("newMat: "+matrix.length+ " : "+matrix[0].length);
        int[] row = new int[matrix[0].length];
        int[] col = new int[matrix.length];
        //System.out.println("row: "+row.length);
        //System.out.println("col: "+col.length);
        int[][] newMat = new int[row.length][col.length];
        for(int i=0;i< row.length;i++) {
            for(int j=0;j<col.length;j++) {
                newMat[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i< newMat.length;i++) {
            for(int j=0;j < newMat[i].length;j++) {
                System.out.print(newMat[i][j]+" ");
            }
            System.out.println();
        }
        /*int rows = matrix.length;
        int cols = rows > 0 ? matrix[0].length : 0;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                result[j][i] = matrix[i][j];
            }
        }*/
        return newMat;
    }
}

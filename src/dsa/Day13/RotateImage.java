package dsa.Day13;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {
        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j < matrix[i].length;j++) {
                if(j > i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        int left = 0, right = matrix.length-1;
        while(left < right) {
            for(int j=0;j< matrix.length;j++) {
                int temp = matrix[j][left];
                matrix[j][left] = matrix[j][right];
                matrix[j][right] = temp;
            }
            left++;
            right--;
        }

        /*int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }*/
    }
}

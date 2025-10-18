package dsa.Day5;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        columnTraverse(arr);
    }

    private static void columnTraverse(int[][] arr) {
        /*
        * {1,2,3,4},
          {5,6,7,8},
          {9,10,11,12}
                * */
        int rows =  arr.length;
        int cols = arr[0].length;
        int r = rows-1;
        int c = cols-1;
        String direction = "up";
        int index = rows * cols;
        while(index > 0) {
            System.out.print(arr[r][c]+ " ");
            if(direction.equals("up")) {
                if(r-1 < 0) {
                    c--;
                    direction = "down";
                } else {
                    r--;
                }
            } else {
                if(r+1 == rows) {
                    c--;
                    direction = "up";
                } else {
                    r++;
                }
            }
            index--;
        }
    }
}

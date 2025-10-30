package dsa.Day15;

import java.util.ArrayList;
import java.util.List;

public class CalculatingDistance {

    public static List<Long> sumNumbers(List<int[]> queries) {
        List<Long> res = new ArrayList<>();

        for(int[] i: queries) {
            int a = Math.min(i[0], i[1]);
            int b = Math.max(i[0], i[1]);
            long x = ((long) a *(a+1))/2;
            long y = ((long) b *(b+1))/2;
            res.add(y-x+a);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}

package dsa.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Can_Attend_Meetings {

    private static boolean canAttendMeetingsUsingAdditionalSpace(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || interval[0] >= merged.get((merged.size()) - 1)[1]) {
                merged.add(interval);
            } else if (interval[0] < merged.get((merged.size()) - 1)[1]) {
                int[] temp = merged.get((merged.size()) - 1);
                merged.remove((merged.size()) - 1);
                merged.add(new int[]{temp[0], Math.max(temp[1], interval[1])});
            }
        }

        return  merged.size() == intervals.length;
        /*System.out.println(Arrays.toString(merged.get(0)));
        for(int [] i: intervals) {
            System.out.print(i[0]+" "+ i[1]);
            System.out.println();
        }
        for(int [] i: merged) {
            System.out.print(i[0]+" "+ i[1]);
            System.out.println();
        }
        return false;*/
    }

    public static void main(String[] args) {
        int[][] intervals = {{10, 12}, {6, 9}, {13, 15}};
        //int[][] intervals = {{1,5}, {3,9}, {6,8}};
        boolean res = canAttendMeetings(intervals);
        System.out.println("can attend all meetings: "+ res);
    }

    private static boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length == 0) {
            return true;
        }
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        for(int i=1;i < intervals.length;i++) {
            if(intervals[i-1][1] > intervals[i][0]) {
                return false;
            }
        }
        return true;
    }
}

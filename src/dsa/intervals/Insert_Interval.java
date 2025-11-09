package dsa.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_Interval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4,8};
        int[][] res = insert(intervals, newInterval);
        for(int[] i: res) {
            System.out.println(i[0]+" "+i[1]);
        }
    }

    private static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        int i=0;
        //first add all previous meetings, which happen before the new interval
        while(i < intervals.length && intervals[i][1] < newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }
        /*next combine all the meetings that will combine with the new interval
        since we have already added the meetings occurred in teh past,
        the next meeting would either be the new interval, or combining the next meetings
        so check for the next meetings where the starting element of interval is
        less than the ending of newInterval
        */
        while(i < intervals.length && intervals[i][0] < newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        merged.add(newInterval);

        //add remaining intervals;
        while(i < intervals.length) {
            merged.add(intervals[i]);
            i++;
        }
        return merged.toArray(new int[merged.size()][]);
    }
}

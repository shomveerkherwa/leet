package revision.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals2 {

	public static void main(String[] args) {
		//int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] intervals = {{1,3}};
		for(int[] interval : intervals)
			System.out.print(Arrays.toString(interval));
		System.out.println();
		int[][] result = merge(intervals);
		for(int[] merged : result)
			System.out.print(Arrays.toString(merged));
	}
	
	public static int[][] merge(int[][] intervals) {
		List<int[]>result = new ArrayList<>();
		Arrays.sort(intervals, (i1,i2) -> Integer.compare(i1[0], i2[0]));
		int[] newInterval = intervals[0];
		result.add(newInterval);
		
		for(int[] currentInterval : intervals) {
			if(currentInterval[0] <= newInterval[1])
				newInterval[1]= Math.max(newInterval[1], currentInterval[1]);
			else {
				result.add(currentInterval);
				newInterval = currentInterval;
			}
		}
		return result.toArray(new int[result.size()][]);
    }

}

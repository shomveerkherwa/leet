package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergingIntervals {

	public static void main(String[] args) {
		int[][] intervals = {{1,4}, {2,3}};
		print(intervals);
		intervals = merge(intervals);
		System.out.println();
		print(intervals);
	}

	public static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		int i=0; int j=i+1;
		List<int[]> intervalList = new ArrayList<>();
		while(i < intervals.length) {
			int[] curr = intervals[i];
			int[] left = intervals[i];
			int[] right = null;
			if (j == intervals.length) {
				right = left;
			} else {
				right = intervals[j];
			}
			
			while(right[0] <= left[1]) {
				curr[0] = left[0] < right[0]? left[0] : right[0];
				curr[1] = right[1] > left[1]?  right[1] : left[1];
				if(++j >= intervals.length ) {
					i=j;
					break;
				} else {
					right = intervals[j];
				}
			}
			//System.out.println("Merged "+Arrays.toString(left) +" and "+Arrays.toString(right)+ " to "+Arrays.toString(curr));
			intervalList.add(curr);
			i=j++;
		}
		int[][] result = new int[intervalList.size()][2];
		
		for(int p=0; p< intervalList.size(); p++) {
			result[p] = intervalList.get(p);
		}
		
		return result;
    }
	
	private static void print(int[][] intervals) {
		for(int[] a : intervals) {
			System.out.print(Arrays.toString(a) + "\t");
		}
	}
}

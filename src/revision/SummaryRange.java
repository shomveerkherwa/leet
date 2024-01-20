package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRange {

	public static void main(String[] args) {
		//int[]nums = {0,1,2,4,5,7};
		int[]nums = {0,2,3,4,6,8,9};
		System.out.println(Arrays.toString(nums));
		List<String> intervals = summaryRanges(nums);
		for(String interval : intervals)
			System.out.println(interval);
	}

	public static List<String> summaryRanges(int[] nums) {
        List<String> intervals = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
        	int start= nums[i];
            while(i+1 < nums.length && nums[i]+1 == nums[i+1]) {
        		i++;
        	}
        	if(start != nums[i])
        		intervals.add(start+"->"+nums[i]);
        	else {
        		intervals.add(""+nums[i]);
        	}
        }
        return intervals;
    }
}

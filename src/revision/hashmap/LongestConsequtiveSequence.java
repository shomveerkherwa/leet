package revision.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsequtiveSequence {

	public static void main(String[] args) {
		//int[] nums = {0,3,7,2,5,8,4,6,0,1};
		//int[] nums = {100,4,200,1,3,2};
		int[] nums = {0,1,2,1};
		System.out.println(longestConsecutiveAgain(nums));
	}
	
	public static int longestConsecutive(int[] nums) {
		if(nums.length == 1)
            return 1;
		int max = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length-1; i++) {
        	int curMax=1;
        	while( i < nums.length-1 && nums[i] == nums[i+1]-1) {
        		if(!set.contains(nums[i])) {
        			set.add(nums[i]);
            		curMax++;	
        		}
        		i++;
        	}
        	max = Math.max(max, curMax);	
        }
    	return max;
    }
	
	public static int longestConsecutiveAgain(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : nums) {
			set.add(i);
		}
		int max =0;
		for(int n : set) {
			int m = n+1;
			while(set.contains(m)) {
				m++;
			}
			max = Math.max(max, m-n);
		}
		return max;
	}
}

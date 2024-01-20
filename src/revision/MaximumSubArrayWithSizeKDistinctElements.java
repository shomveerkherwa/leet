package revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumSubArrayWithSizeKDistinctElements {

	public static void main(String[] args) {
		// int[] nums= {1,5,4,2,9,9,9}; int k = 3;
		// int[] nums= {4,4,4}; int k = 3;
		int[] nums = {1,1,1,7,8,9}; int k = 3;
		System.out.println(Arrays.toString(nums));
		System.out.println(maximumSubarraySum(nums, k));
	}

	private static int maximumSubarraySum(int[] nums, int k) {
		Map<Integer,Integer> frequency = new HashMap<>();
		int max = 0;
		int currSum = 0;
		int windowStart = 0;
		int windowEnd = 0;
		int size = nums.length;
		
		for(; windowEnd < size; windowEnd++) {
			frequency.put(nums[windowEnd], frequency.getOrDefault(nums[windowEnd], 0)+1);
			currSum = currSum + nums[windowEnd];
			
			// when we have enough bigger window
			if(windowEnd-windowStart+1 == k) {
				
				// but only if the numbers are unique we consider them
				if(frequency.size() >= k) {
					max = Math.max(max,  currSum);
				}
				currSum = currSum - nums[windowStart];
				frequency.put(nums[windowStart], frequency.getOrDefault(nums[windowStart], 0)-1);
				
				if(frequency.get(nums[windowStart]) == 0) {
					frequency.remove(nums[windowStart]);
				}
				windowStart++;
			}
		}
		return max;
	}

}

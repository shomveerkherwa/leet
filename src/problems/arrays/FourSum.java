package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] nums = {1000000000,1000000000,1000000000,1000000000};
		int target = -294967296;
		List<List<Integer>> batch = fourSum(nums, target);
		for(List<Integer> threes : batch) {
			System.out.println(Arrays.toString(threes.toArray()));
		}
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> batch = new ArrayList<>();
		if(nums == null || nums.length < 4)
			return batch;
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		for(int i=0; i<nums.length-3; i++) {
			int left = i+1;   
			while(left < nums.length-2) {
				int right = nums.length-1;
				int secondLeft = left+1;
				long sumOf2 = nums[i] + nums[left];
				while(secondLeft < right) {
					long sumof4 = sumOf2 + nums[secondLeft] + nums[right];
					//System.out.println("Considering  " + nums[i] + " , " + nums[left] + " , " + nums[secondLeft]+ " , " + nums[right]);
					if(sumof4 < Integer.MAX_VALUE && sumof4 > Integer.MIN_VALUE && sumof4 == target) {
						List<Integer> group = Arrays.asList(nums[i], nums[left], nums[secondLeft], nums[right]);
						batch.add(group);
						secondLeft++;
						right--;
						while(secondLeft < right && nums[secondLeft] == nums[secondLeft-1])
							secondLeft++;
						while(secondLeft < right && nums[right] == nums[right+1])
							right--;
					}
					if(sumof4 < target)
						secondLeft++;
					else if(sumof4 > target)
						right--;
				}
				left++;
				while(left < secondLeft && nums[left] == nums[left -1]) {
					left++;
				}
			}
		}
		return batch;
    }

}

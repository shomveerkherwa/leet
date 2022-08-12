package problems.arrays;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		//int[] nums = {-1,2,1,-4}; int target = 2;
		//int[] nums = {1, 1, 1, 0}; int target = -100;
		int[] nums = {4,0,5,-5,3,3,0,-4,-5}; int target = -2;
		int closestSum = threeSumClosest(nums, target);
		System.out.println(closestSum);
	}
	
	public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int result = nums[0] + nums[1] + nums[nums.length-1];
		for(int i=0; i<nums.length; i++) {
			int left = i+1; int right = nums.length - 1;
			while (left < right) {
				System.out.println("Considering" + nums[i] + " , " + nums[left] + " , " + nums[right]);
				int currentSum = nums[i] + nums[left] + nums[right];
				if (currentSum < target) {
					left++;
				} else if (currentSum > target) {
					right--;
				} else {
					return currentSum;
				}
				//currentClose = Math.min(closestDiff, Math.abs(Math.subtractExact(target , currentSum)));
				if(Math.abs(currentSum - target) < Math.abs(result - target)) {
					result = currentSum;
				}
			}
		}
		return result;
    }
}

package revision.slidingwindow;

public class MinimumLengthSubArray {

	public static void main(String[] args) {
		//int target = 7; int[] nums = {2,3,1,2,4,3};
		//int target = 4; int[] nums = {1,4,4};
		int target = 4; int[] nums = {1,4,4};
		System.out.println(minSubArrayLen(target, nums));
		
	}
	
	public static int minSubArrayLen(int target, int[] nums) {
		int minSize = Integer.MAX_VALUE;
		int left=0;int right=0; int currSum = 0; int length=minSize;;
		while(right < nums.length) {
			currSum = currSum + nums[right++];
			while(currSum >= target) {
				length = right-left;
				currSum= currSum-nums[left++];
				minSize = Math.min(minSize, length);
			}
		}
		return minSize;
	}
}

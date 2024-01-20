package problems.arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumberUsingXOR(nums));
	}

	public static int missingNumber(int[] nums) {
		int sum = nums.length;
		for(int i=0; i< nums.length; i++) {
			sum = sum+i;
			sum = sum - nums[i];
		}
		return sum;
	}
	
	public static int missingNumberUsingXOR(int[] nums) {
		int sum = nums.length;
		for(int i=0; i< nums.length; i++) {
			sum = sum ^ i;
			sum = sum ^ nums[i];
		}
		return sum;
	}

}

package problems;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] nums = {3,0,1};
		int n = missingNumber(nums);
		System.out.println("Missing num in array "+Arrays.toString(nums)+" is "+n);
	}

	private static int missingNumber(int[] nums) {
		
		int n = nums.length;
		int sum = 0 ;
		for(int i=0; i< n; i++) {
			sum = sum + nums[i]; 
		}
		return ((n * (n+1))/2 - sum);
	}

}

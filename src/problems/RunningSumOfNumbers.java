package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningSumOfNumbers {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] runningSum = runningSum(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(runningSum));
	}

	 public static int[] runningSum(int[] nums) {
	    int sum = 0;
	    for(int i=0; i<nums.length; i++) {
	    	sum = sum + nums[i];
	    	nums[i] = sum;
	    }
	    return nums;
	 }
	 
	 public static int[] runningSum2(int[] nums) {
		    List<Integer> list = new ArrayList<>();
		    int sum = 0;
		    
		    return list.stream().mapToInt(i -> i).toArray();
		 }
}

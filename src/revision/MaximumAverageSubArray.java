package revision;

import java.util.Arrays;

public class MaximumAverageSubArray {

	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3}; int k = 4;
		//int[] nums = {-1}; int k = 1;
		//int[] nums = {1,2,3}; int k = 3;
		//int k = 93; int[] nums= {8860,-853,6534,4477,-4589,8646,-6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,-4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,-1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,-4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891};
		//int k= 3; int[] nums= {1,2,3}; 
		//int k=4; int[] nums = {0,1,1,3,3};
		System.out.println(nums.length);
		System.out.println(Arrays.toString(nums));
		System.out.println(findMaxAverageAgain(nums, k));
		System.out.println(fromLeetCode(nums, k));
	}

	public static double fromLeetCode(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        long max = sum;
        
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }
        return max / 1.0 / k;
    }
	
	 public static double findMaxAverageAgain(int[] nums, int k) {
	        if(k==1 && (nums.length == 1))
	            return nums[0];
	        double result = 0;
	        int left=0; int right=0;
	        double sum = 0;

	        for(;right < k;right++){
	            sum = sum + nums[right];
	        }
	        result = sum;
	        for(right =k;right < nums.length;right++) {
	        	sum = sum + nums[right]- nums[left++];
	        	result = Math.max(result, sum);
	        }
	        return result/1.0/k;
	        }
	
	public static double findMaxAverage(int[] nums, int k) {
		if(k==1 && (nums.length == 1))
            return nums[0];
        double result = Integer.MIN_VALUE;
        int left=0; int right=0;
        double currAverage = 0;
        double sum = 0;
        for(;right < nums.length;right++) {
        	sum = sum + nums[right];
        	if(right-left+1 >= k) {
        		currAverage = sum/k;
        		result = Math.max(result, currAverage);
        		sum = sum-nums[left++];
        	}
        }
        return result;
    }
}

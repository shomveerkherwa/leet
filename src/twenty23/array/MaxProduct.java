package twenty23.array;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String[] args) {
		//int[] nums = {1,2,3,4};
		int[] nums = {-1,1,0,-3,3}; // [0,0,9,0,0]
		System.out.println(Arrays.toString(nums));
		int[] answer = productExceptSelf(nums);
		System.out.println(Arrays.toString(answer));
		
	}

	public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
                
        for(int i=0, curr=1; i<nums.length; i++) {
        	// add the left handed product
        	answer[i] = curr;
        	// hold the entire left hand product in a variable;
        	curr = curr * nums[i];
        }
        
        for(int i = nums.length-1, curr = 1; i >=0; i--) {
        	answer[i] = answer[i] * curr;
        	curr = curr * nums[i];
        }
        
        return answer;
    }
}

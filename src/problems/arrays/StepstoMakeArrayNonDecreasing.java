package problems.arrays;

import java.util.Stack;

public class StepstoMakeArrayNonDecreasing {

	public static void main(String[] args) {
		int[] nums = {5,3,4,4,7,3,6,11,8,5,11};
		//int[] nums = {4,5,7,7,13};
		
		//int[] nums = {10,1,2,3,4,5,6,1,2,3};
		
		System.out.println(totalStepsAgain(nums));
	}

	public static int totalStepsAgain(int[] nums) {
		Stack st = new Stack<Integer>();
        st.push(0);
        int steps=0;
        int step_arr[] = new int[nums.length]; 
        for(int i=1;i<nums.length;i++){
            int max_steps = 0;
            while(!st.empty() && nums[i]>=nums[(Integer)st.peek()]){
                max_steps=Math.max(max_steps,step_arr[(Integer)st.peek()]);
                st.pop();
            }
            if(!st.empty() && nums[i]<nums[(Integer)st.peek()]){
                    step_arr[i]=1+max_steps;
            }
            steps = Math.max(steps,step_arr[i]);
            st.push(i);
        }
        return steps;
    }
	
	public static int totalSteps(int[] nums) {
        int max = 0;
        
        int[] dp = new int[nums.length];
        dp[0] = 0;
        int currentMax = nums[0];
        int stepsMax = 0;
        
        for(int i=1; i<=nums.length-1; i++) {
        	if(nums[i] < currentMax) {
        		if(nums[i] < nums[i-1] && stepsMax != 0)
        			dp[i] = dp[i-1];
        		else
        			dp[i] = 1 + stepsMax;
        		stepsMax = dp[i];
        	} else {
        		currentMax = nums[i];
        		dp[i] = 0;
        		stepsMax = 0;
        	}
        }
        
        for(int i=0; i<nums.length; i++)
        	max = Math.max(max, dp[i]);
        
        return max;
    }
}

package problems.arrays;

import java.util.Arrays;
import java.util.Stack;

public class NextBigElementCircularArray {

	public static void main(String[] args) {
		int[] inp = {9,2,3,6,5};
		//int[] inp = {1,2,1};
		int[] result = nextGreaterElementsBetter(inp);
		System.out.println(Arrays.toString(inp));
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] nextGreaterElementsInternet(int[] nums) {
        Stack<Integer> stacker = new Stack<>();
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        for (int cnt = 0; cnt < 2; cnt++){
            for (int i = 0; i < nums.length; i++){
                while (!stacker.isEmpty() && nums[stacker.peek()] < nums[i])
                    res[stacker.pop()] = nums[i];
                if (cnt == 0) stacker.push(i);
             }       
        }
        return res;
    }
	
	private static int[] nextGreaterElementsBetter(int[] inp) {
		int[] result = new int[inp.length];
		Arrays.fill(result, -1);
		int size = inp.length;
        Stack<Integer> mono = new Stack<>();
        for(int i=0; i< size; i++) {
        	while(!mono.isEmpty() && inp[i] > inp[mono.peek()]) {
        		result[mono.pop()] = inp[i];
        	}
        	mono.push(i);
        }
        
        for(int i=0; i< size; i++) {
        	while(!mono.isEmpty() && inp[i] > inp[mono.peek()]) {
        		result[mono.pop()] = inp[i];
        	}
        }
        return result;
	}

	// 1, 2, 3, 4, 5
	public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
        	int max = nums[i];
        	int j = (i+1) % size;
        	while(j != i && max == nums[i]) {
        		max = Math.max(max, nums[j]);
        		j = (j+1)%size;
        	}
        	if(max <= nums[i])
    			result[i] = -1;
    		else
    			result[i] = max;
        }
        return result;
    }
	
}

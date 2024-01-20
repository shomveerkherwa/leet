package problems.arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {0,2,2}; int val = 2;
		System.out.println(removeElement(nums, val));
	}

	 public static int removeElement(int[] nums, int val) {
	        int start = 0;
	        int end = nums.length -1 ;
	        
	        while(end >= 0 && nums[end] == val)
	        	end--;
	        
	        while(start <= end) {
	        	if(nums[start] == val) {
	        		//swap with end
	        		int temp = nums[end];
	        		nums[end] = nums[start];
	        		nums[start] = temp;
	        		
	        		// decrement end
	        		end--;
	        		while(end >= 0 && nums[end] == val)
	     	         end--;
	        	}
	        	start++;
	        }
	        
	        return start;
	 }
}

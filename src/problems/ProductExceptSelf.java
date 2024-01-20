package problems;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(nums));
		nums = productExceptSelf(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static int[] productExceptSelf(int[] nums) {
		int size = nums.length;
        int[] left = new int[size];
        int[] right = new int[size];
        int index = 1;
        int leftProduct = 1;
        int rightProduct = 1;
        left[0] = leftProduct;
        right[size-1] = rightProduct;
        
        while(index < size) {
        	leftProduct = leftProduct * nums[index-1];
        	left[index] = leftProduct;
        	index++;
        }
        
        System.out.println(Arrays.toString(left));
        index = size-2;
        
        while(index >= 0) {
        	rightProduct = rightProduct * nums[index+1];
        	right[index] = rightProduct;
        	index--;
        }
        System.out.println(Arrays.toString(right));
        index=0;
        while(index<size) {
        	nums[index] = left[index]*right[index];
        	index++;
        }
        return nums;
    }

}
